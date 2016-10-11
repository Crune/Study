package test.struts;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import login.action.UserAction;

public class FormProAction extends ActionSupport {
	
	private static final long serialVersionUID = 876998284539669537L;

	Log log = LogFactory.getLog(UserAction.class);
	
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		log.info("set");
		this.id = id;
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getNum() {
		return 1000;
	}
	
	@Override
	public String execute() {
		log.info("id"+id);
		log.info("pw"+pw);
		
		return SUCCESS;
	}	
	
	@Override
	public void validate() {
		log.info("val");
		
	}
	
	
}
