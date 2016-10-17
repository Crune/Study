package test.ibatis;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

public class DeleteProAction extends IbatisActionSupport {
	
	private static final long serialVersionUID = 2914259919576324530L;
	
	private String passwd;
	public String getPasswd() { return passwd; }
	public void setPasswd(String passwd) { this.passwd = passwd; }
	
	private int check;
	public int getCheck() { return check; }
	public void setCheck(int check) { this.check = check; }

	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession();
	    String id = (String)session.getAttribute("memId");		

		HashMap map = new HashMap();
		map.put("id", id);
		map.put("passwd", passwd);		
		
		sqlMap.delete("deleteMember", map);
		check = (Integer)sqlMap.queryForObject("confirmId", id);
		
		log.info(map.toString()+"\trst=>\t"+check);
		if (check == 0) {
			session.invalidate();
		}
		return SUCCESS;
	}

}
