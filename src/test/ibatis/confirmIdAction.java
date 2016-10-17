package test.ibatis;

public class confirmIdAction extends IbatisActionSupport {
	
	private static final long serialVersionUID = -539661010571024121L;
	
	private String id;
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	
	private int check;
	public int getCheck() { return check; }
	public void setCheck(int check) { this.check = check; }

	@Override
	public String execute() throws Exception {
		setCheck((Integer)sqlMap.queryForObject("confirmId", getId()));
		return SUCCESS;
	}
}
