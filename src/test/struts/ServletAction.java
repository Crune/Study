package test.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.ServletRequestAware;

public class ServletAction implements ServletRequestAware{

	Log log = LogFactory.getLog(ServletAction.class);

	HttpServletRequest request;

	public String execute() throws Exception {
		String id = request.getParameter("id");
		log.info("id="+id);
		return "success";
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
