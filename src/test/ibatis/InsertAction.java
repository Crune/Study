package test.ibatis;

import java.io.Reader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public	class InsertAction
			extends ActionSupport
			implements Preparable, ModelDriven<TestDTO>
{
	private static final long serialVersionUID = -3110714759159888595L;
	Log log = LogFactory.getLog(InsertAction.class);
	
	private TestDTO dto;

	@Override
	public String execute() throws Exception {
		Reader re = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(re);
		
		sqlMap.insert("insertTest", dto);
		
		return SUCCESS;
	}

	@Override
	public TestDTO getModel() { return dto; }

	@Override
	public void prepare() throws Exception {
		dto = new TestDTO();
	}

}
