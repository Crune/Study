package test.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import login.action.UserAction;

public class MyInterceptor implements Interceptor {

	private static final long serialVersionUID = 7583764664288055118L;
	
	Log log = LogFactory.getLog(UserAction.class);

	@Override
	public void destroy() {}

	@Override
	public void init() {
		log.info("init()");
	}

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		log.info("전");
		String result = inv.invoke();
		log.info("후"+result);
		return result;
	}

}
