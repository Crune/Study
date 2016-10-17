package test.ibatis;

public	class InputProAction extends LogonActionSupport {

	private static final long serialVersionUID = -6262938740094574785L;
	@Override
	public String execute() throws Exception {
		sqlMap.insert("join", dto);
		return SUCCESS;
	}
}
