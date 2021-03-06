package imagetools.servlet;

import imagetools.util.Constant;
import imagetools.util.NetworkUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class GetImageServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			String categoryName = req.getParameter("categoryName");
			String picSource = req.getParameter("picSource");

			List<String> returnedList = new ArrayList<String>();

			HttpSession session = req.getSession();

			session.setAttribute("categoryName", categoryName);
			session.setAttribute("picSource", picSource);
			session.setAttribute("images", returnedList);

			if ("google".equals(picSource)) {
				List<String> list = new ArrayList<String>();

				for (int i = 0; i < 4; i++) {
					String queryString = new StringBuffer(Constant.GOOGLE_URL)
							.append("q=").append(categoryName)
							.append("&start=").append(8 * i).toString();

					list.add(NetworkUtil.getStringContentFromURL(queryString));
				}

				for (String result : list) {
					JSONObject jsonContent = new JSONObject(result);

					JSONObject responseData = jsonContent
							.getJSONObject("responseData");

					JSONArray results = responseData.getJSONArray("results");

					for (int i = 0; i < results.length(); i++) {
						JSONObject jsonObject = results.getJSONObject(i);

						String url = jsonObject.getString("url");

						returnedList.add(url);
					}
				}
			}
			// flickr
			else {
				String urlString = Constant.FLICKR_URL + "tags=" + categoryName;

				String jsonContent = NetworkUtil
						.getStringContentFromURL(urlString);

				jsonContent = jsonContent.substring(14,
						jsonContent.length() - 1);

				JSONObject jsonObject = new JSONObject(jsonContent);

				JSONArray jsonArray = jsonObject.getJSONObject("photos")
						.getJSONArray("photo");

				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject object = jsonArray.getJSONObject(i);

					String id = object.getString("id");
					int farmId = object.getInt("farm");
					String serverId = object.getString("server");
					String secretId = object.getString("secret");

					StringBuffer buffer = new StringBuffer();

					buffer.append("http://farm").append(farmId)
							.append(".static.flickr.com/").append(serverId)
							.append("/").append(id).append("_")
							.append(secretId).append(".jpg");
					returnedList.add(buffer.toString());
				}
			}

			Gson gson = new Gson();

			String jsonResult = gson.toJson(returnedList);

			resp.setContentType("application/json; charset=utf-8");
			resp.setHeader("pragma", "no-cache");
			resp.setHeader("cache-control", "no-cache");

			PrintWriter out = resp.getWriter();

			out.print(jsonResult);

			out.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
