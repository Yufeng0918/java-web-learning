package lecture04.builtInObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");

		req.setAttribute("username", username);

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < 100; i++) {
			list.add(String.valueOf(i));
		}

		req.setAttribute("list", list);

		RequestDispatcher rd = req
				.getRequestDispatcher("lecture04.BuiltInObject/ForwardResult.jsp");

		rd.forward(req, resp);

	}
}
