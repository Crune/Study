package test.struts;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.interceptor.Myface;

public class FormProAction extends ActionSupport implements Preparable, ModelDriven<DTO>, Myface {

	private static final long serialVersionUID = 876998284539669537L;

	//Log log = LogFactory.getLog(FormProAction.class);

	private DTO dto;
	
	private Date d;
	
	public int getNum() {
		return 1000;
	}
	
	@Override
	public String execute() {		
		log.info("execute()");
		
		log.info("id:\t"+dto.getId());
		log.info("pw:\t"+dto.getPw());
		log.info("time:\t"+d);
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		log.info("validate()");		
	}
	
	@Override
	public void prepare() throws Exception {
		log.info("prepare()");
		dto = new DTO();
	}

	@Override
	public DTO getModel() {
		log.info("getModel()");
		return dto;
	}

	@Override
	public void setDate(Date d) {
		this.d = d;
	}

	/*
	@Override
	public void test() {
		log.info("FormProAction.test()");
	}*/

	
	
}
