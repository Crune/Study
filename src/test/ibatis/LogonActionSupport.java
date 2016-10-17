package test.ibatis;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import ch11.logon.LogonDataBean;

public abstract class LogonActionSupport
	extends ActionSupport
	implements
		ServletRequestAware,
		IbatisAware,
		Preparable,
		ModelDriven<LogonDataBean>
{
	protected SqlMapClient sqlMap;
	protected HttpServletRequest request = null;
	
	protected LogonDataBean dto;
	
	public LogonDataBean getDto() { return dto; }
	public void setDto(LogonDataBean dto) { this.dto = dto; }
	
	@Override
	public abstract String execute() throws Exception;
	
	@Override
	public void setServletRequest(HttpServletRequest request) { this.request = request; }
	
	@Override
	public void setIbatis(SqlMapClient sqlMap) { this.sqlMap = sqlMap; }
	
	@Override
	public LogonDataBean getModel() { return dto; }
	
	@Override
	public void prepare() throws Exception { dto = new LogonDataBean(); }
	
}
