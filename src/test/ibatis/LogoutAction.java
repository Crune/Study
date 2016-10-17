package test.ibatis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;

public	class LogoutAction implements Action, ServletRequestAware  {

	private HttpServletRequest request = null;

	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession();
		session.invalidate();
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) { this.request = request; }

}
