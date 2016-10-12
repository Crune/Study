package test.struts;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login.action.UserAction;

public class FormProAction extends ActionSupport implements Preparable, ModelDriven<DTO> {

	private static final long serialVersionUID = 876998284539669537L;

	Log log = LogFactory.getLog(UserAction.class);
	
	public int getNum() {
		return 1000;
	}
	private DTO dto;
	
	@Override
	public String execute() {		
		log.info("execute()");
		
		log.info("id"+dto.getId());
		log.info("pw"+dto.getPw());
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

	
	
}
