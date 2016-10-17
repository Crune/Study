package test.ibatis;

import javax.servlet.http.HttpSession;

public class ModifyProAction extends LogonActionSupport {
	private static final long serialVersionUID = 3480944254243058732L;

	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession();
		dto.setId((String) session.getAttribute("memId"));
		log.info("dto: "+dto.toString());
		sqlMap.update("modify", dto);
		return SUCCESS;
	}
}
