package lecture06.advServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();

		if (null == session.getAttribute("user")) {
			resp.sendRedirect("lecture06.advServlet/SessionLogin.jsp");
			return;
		}

		User user = (User) session.getAttribute("user");

		if ("1".equals(user.getAuthority())) {
			System.out.println("Common User");
		} else {
			System.out.println("Administrator");
		}

	}
}
