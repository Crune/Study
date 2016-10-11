package test.struts;

public class FormProAction {
	
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	public String execute() {
		System.out.println(id+"//"+pw);		
		
		return "success";
	}
}
