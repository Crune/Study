package test.interceptor;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public interface Myface {
	public void setDate(Date d);
	Log log = LogFactory.getLog(Myface.class);
    //Logger log = LoggerFactory.getLogger(Myface.class);
    //logger.info("Hello World");
}
