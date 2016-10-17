package test.ibatis;

import javax.servlet.http.HttpSession;

import ch11.logon.LogonDataBean;

public class ModifyFormAction extends LogonActionSupport {
	private static final long serialVersionUID = -7493586061244654168L;
	
	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession();
		String id = session.getAttribute("memId")+"";
		setDto((LogonDataBean) sqlMap.queryForObject("getId", id));
		return SUCCESS;
	}
}
