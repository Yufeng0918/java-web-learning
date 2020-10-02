package lecture07.tagLib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSTLCore
 */
public class JSTLCore extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JSTLCore() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// standard property
		request.setAttribute("hello", "Hello World");

		// test empty
		request.setAttribute("v1", 1);
		request.setAttribute("v2", 2);
		request.setAttribute("v3", new ArrayList<Object>());
		request.setAttribute("v4", "test");

		// html text
		request.setAttribute("WelStr", "<font color='red'>Welcome Singapore</font>");

		// c:forEach
		Group group = new Group();
		group.setName("NUS");

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setUsername("user_" + i);
			user.setAge(18 + i);
			user.setGroup(group);
			userList.add(user);
		}

		request.setAttribute("userlist", userList);

		// test map
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		request.setAttribute("mapvalue", map);

		// test c:forTokens
		request.setAttribute("strTokens", "1,2,3,4,5,6");

		request.getRequestDispatcher("/lecture07.TagLib/JSTL1_Core.jsp")
				.forward(request, response);
	}

}
