package test.struts;

import com.opensymphony.xwork2.Action;

public class Hello implements Action {
	public String execute() throws Exception {
			return SUCCESS;
	}
	
	public String test() {
		return "ok";		
	}
}
