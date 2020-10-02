package lecture06.advServlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CustomizeServletContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("destroyed" + sce.getServletContext());
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("initialized" + sce.getServletContext());
	}

}
