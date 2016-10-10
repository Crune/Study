package login.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;

import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction implements Action {
	private String name;
	private String addr;
	private String tel;

	Log log = LogFactory.getLog(UserAction.class);

	@Override
	public String execute() throws Exception {
		log.info(">>>>> execute ");
		//UserInfo 객체 생성
		UserInfo userInfo = new UserInfo();
		userInfo.setName(name);
		userInfo.setAddr(addr);
		userInfo.setTel(tel);
		log.info(">>>>> userInfo Object Create...");
		//사용자정보 입력위해 DAO 호출
		UserDAO loginDao = new UserDAO();

		if (loginDao.save(userInfo)) {
			log.info(">>>>>> data : "+userInfo.toString());		
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

}
