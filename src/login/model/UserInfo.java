package login.model;

public class UserInfo {
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", addr=" + addr + ", tel=" + tel + "]";
	}
	private String name;
	private String addr;
	private String tel;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
