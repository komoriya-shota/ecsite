package jp.co.internous.ecsite.model.domain;

public class MstUser {

	private int id;
	
	private String userName; // 変数名を正しいものに変更しました
	
	private String password;
	
	private String fullName;
	
	private int isAdmin;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() { // メソッド名を正しいものに変更しました
		return userName;
	}
	
	public void setUserName(String userName) { // メソッド名を正しいものに変更しました
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) { // メソッド名と引数名を正しいものに変更しました
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getIsAdmin() { // メソッドの戻り値の型を正しいものに変更しました
		return isAdmin;
	}
	
	public void setIsAdmin(int isAdmin) { // メソッドの引数の型と引数名を正しいものに変更しました
		this.isAdmin = isAdmin;
	}	
}
