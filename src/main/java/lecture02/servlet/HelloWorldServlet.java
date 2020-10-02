package lecture02.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<html><head><title>Hello World Sample</title></head>");

		out.println("<body><h1>Hello World: " + new Date().toString()
				+ "</h1></body></html>");

		System.out.println(new Date().toString());

		out.flush();
	}
}
