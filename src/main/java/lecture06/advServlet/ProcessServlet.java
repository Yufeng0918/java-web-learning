package lecture06.advServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.process(req, resp);
	}

	protected void process(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");

		String[] interest = req.getParameterValues("interest");
		String address = req.getParameter("address");

		address = new String(address.getBytes("iso-8859-1"), "utf-8");

		System.out.println(req);

		String comment = req.getParameter("comment");

		List<String> list = new ArrayList<String>();

		if (null == username || "".equals(username)) {
			list.add("Username invalid");
		} else if (username.length() < 4) {
			list.add("Username less than 4 chars");
		} else if (username.length() > 10) {
			list.add("Username more than 10 chars");
		}

		if (null == password || "".equals(password)) {
			list.add("Password invalid");
		} else if (password.length() < 4) {
			list.add("Password less than 4 chars");
		} else if (password.length() > 10) {
			list.add("Password more than 10 chars");
		}
		if (null == gender) {
			list.add("Gender invalid");
		}

		if (null == interest) {
			list.add("Interest is zero");
		} else if (interest.length > 3) {
			list.add("Interest is more than 3");
		}
		if (null == comment || "".equals(comment)) {
			list.add("Commment invalid");
		}

		resp.setCharacterEncoding("utf-8");

		if (list.isEmpty()) {
			req.setAttribute("username", username);
			req.setAttribute("password", password);
			req.setAttribute("gender", gender);
			req.setAttribute("interest", interest);
			req.setAttribute("address", address);
			req.setAttribute("comment", comment);

			req.getRequestDispatcher("/lecture06.advServlet/LoginSuccess.jsp")
					.forward(req, resp);
		} else {
			req.setAttribute("error", list);

			req.getRequestDispatcher("/lecture06.advServlet/LoginFailure.jsp")
					.forward(req, resp);
		}
	}

}
