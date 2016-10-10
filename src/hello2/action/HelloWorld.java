package hello2.action;

import com.opensymphony.xwork2.Action;

public class HelloWorld implements Action {
	private String name;
	private String msg;
	private String retMsg;  //client로 보낼 오류 메시지를 담기 위해

	public String getMsg() {
		return msg;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getRetMsg() {
		return retMsg;
	}

	@Override
	public String execute() throws Exception {
		//validation check
		if (name == null || "".equals(name)) {
			retMsg = "Enter Name!!";
			return INPUT;
		}		
		msg = "Hello," + name;		
		return SUCCESS;
	}
}
