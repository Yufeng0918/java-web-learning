package lecture07.tagLib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomizeTag1 extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		try {
			this.pageContext.getOut().println("Customize Tag Start[");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			this.pageContext.getOut().println("] Customize Tag End");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

}
