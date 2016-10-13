package test.interceptor;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import login.action.UserAction;

public class MyInterceptor implements Interceptor {

	private static final long serialVersionUID = 7583764664288055118L;
	
	Log log = LogFactory.getLog(MyInterceptor.class);

	@Override
	public void destroy() {}

	private Date d;
	
	@Override
	public void init() {
		log.info("init()");
		d = new Date();
		d.setTime(System.currentTimeMillis());
	}

	@Override
	public String intercept(ActionInvocation inv) throws Exception {
		log.info("intercept.start");
		
		Object obj = inv.getAction();		
		if (obj instanceof Myface) {
			Myface face = (Myface) obj;
			face.setDate(d);
		}
		
		String result = inv.invoke();
		
		
		log.info("intercept.end\tresult : "+result);
		return result;
	}

} 