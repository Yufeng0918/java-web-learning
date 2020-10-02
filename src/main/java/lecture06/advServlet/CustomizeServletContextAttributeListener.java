package lecture06.advServlet;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class CustomizeServletContextAttributeListener implements
		ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent scab) {
		System.out.println("attribute added");
		System.out.println(scab.getName() + ":" + scab.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent scab) {
		System.out.println("attribute removed");
		System.out.println(scab.getName() + ":" + scab.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent scab) {
		System.out.println("attribute replaced");
		System.out.println(scab.getName() + ":" + scab.getValue());
	}
}
