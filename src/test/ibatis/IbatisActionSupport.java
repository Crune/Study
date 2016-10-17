package test.ibatis;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ActionSupport;

public abstract class IbatisActionSupport extends ActionSupport implements ServletRequestAware, IbatisAware {

	protected SqlMapClient sqlMap;
	protected HttpServletRequest request = null;

	@Override
	public abstract String execute() throws Exception;

	@Override
	public void setServletRequest(HttpServletRequest request) { this.request = request; }

	@Override
	public void setIbatis(SqlMapClient sqlMap) { this.sqlMap = sqlMap; }

}
