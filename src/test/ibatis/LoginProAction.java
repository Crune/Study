package test.ibatis;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ActionSupport;

public	class LoginProAction extends IbatisActionSupport {

	private static final long serialVersionUID = -6262938740094574785L;

	@Override
	public String execute() throws Exception {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		HashMap map = new HashMap();
		map.put("id", id);
		map.put("passwd", passwd);
		
		log.info(map.toString());
		
		int check = (Integer)sqlMap.queryForObject("userCheck", map);
		if (check == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("memId",id);
			return SUCCESS;
		} else {
			request.setAttribute("check", new Integer(check));
			return "wrong";
		}
	}
}
