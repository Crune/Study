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
	private List agelist;
	private TestDTO rst;

	@Override
	public String execute() throws Exception {
		Reader re = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(re);
		
		list = sqlMap.queryForList("testAll");
		agelist = sqlMap.queryForList("testAge");
		
		rst = (TestDTO) sqlMap.queryForObject("testId", "spring");
		
		return SUCCESS;
	}

	public List<TestDTO> getList() {
		return list;
	}
	public List<TestDTO> getAgelist() {
		return agelist;
	}

	public TestDTO getRst() {
		return rst;
	}

}
