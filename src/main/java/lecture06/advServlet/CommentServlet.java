package lecture06.advServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// String username = (String)req.getAttribute("username");
		// String comment = (String)req.getAttribute("comment");

		req.getRequestDispatcher("/lecture06.advServlet/CommentResult.jsp")
				.forward(req, resp);

	}
}
