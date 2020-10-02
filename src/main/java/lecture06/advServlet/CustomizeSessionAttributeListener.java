package lecture06.advServlet;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class CustomizeSessionAttributeListener implements
		HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("attribute added");
		System.out.println(se.getName() + ":" + se.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("attribute removed");
		System.out.println(se.getName() + ":" + se.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("attribute replaced");
		System.out.println(se.getName() + ":" + se.getValue());
	}

}
