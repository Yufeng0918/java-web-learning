package lecture06.advServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FilterLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		User user = new User();

		HttpSession session = req.getSession();

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String authority = req.getParameter("authority");

		if ("1".equals(authority)) {
			if ("zhangsan".equals(username) && "123".equals(password)) {
				user.setUsername(username);
				user.setPassword(password);
				user.setAuthority(authority);

				session.setAttribute("user", user);

				req.getRequestDispatcher(
						"/lecture06.advServlet/FilterIndex.jsp").forward(req,
						resp);
			} else {
				resp.sendRedirect("lecture06.advServlet/FilterLogin.jsp?username="
						+ username + "&authority=" + authority);
			}
		}

		else if ("2".equals(authority)) {
			if ("lisi".equals(username) && "456".equals(password)) {
				user.setUsername(username);
				user.setPassword(password);
				user.setAuthority(authority);

				session.setAttribute("user", user);

				req.getRequestDispatcher(
						"/lecture06.advServlet/FilterIndex.jsp").forward(req,
						resp);
			} else {
				resp.sendRedirect("lecture06.advServlet/FilterLogin.jsp?username="
						+ username + "&authority=" + authority);
			}
		} else {
			resp.sendRedirect("lecture06.advServlet/FilterLogin.jsp?username="
					+ username + "&authority=" + authority);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

}
