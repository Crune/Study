package test.struts;

import java.util.Date;

import test.interceptor.Myface;

public class FormAction implements Myface {
	
	//Log log = LogFactory.getLog(FormAction.class);
	
	@SuppressWarnings("unused")
	private Date d;
	
	public String execute() {
		return "success";
	}

	@Override
	public void setDate(Date d) {
		this.d = d;
	}
	
	/*
	@Override
	public void test() {
		log.info("FormAction.test()");
	}*/
}
