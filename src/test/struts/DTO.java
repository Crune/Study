package test.struts;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import login.action.UserAction;

public class DTO {

	Log log = LogFactory.getLog(UserAction.class);

	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		log.info("setId("+id+")");
		this.id = id;
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}
