package lecture08.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		int param1 = Integer.parseInt(req.getParameter("param1"));
		int param2 = Integer.parseInt(req.getParameter("param2"));

		resp.setHeader("pragma", "no-cache");
		resp.setHeader("cache-control", "no-cache");

		PrintWriter out = resp.getWriter();
		out.println(String.valueOf(param1 + param2));
		out.flush();
	}
}
