package lecture07.tagLib;

import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitResourceServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		Properties ps = new Properties();

		try {
			ServletContext context = config.getServletContext();

			InputStream is = context
					.getResourceAsStream("/WEB-INF/message.properties");

			ps.load(is);

			is.close();
			context.setAttribute("ps", ps);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
