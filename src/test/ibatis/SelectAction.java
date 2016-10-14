package test.ibatis;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.ActionSupport;

public class SelectAction extends ActionSupport {

	private static final long serialVersionUID = -2213594370753747446L;
	
	private List list;

	@Override
	public String execute() throws Exception {
		Reader re = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(re);
		
		list = sqlMap.queryForList("testAll");
		
		return SUCCESS;
	}

	public List<TestDTO> getList() {
		return list;
	}

	public void setList(List<TestDTO> list) {
		this.list = list;
	}

}
