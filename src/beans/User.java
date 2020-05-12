package beans;

public class User {

	private String id;
	private String name;
	private String pass;

	public User() {}


	//ログイン時に使用するコンストラクター
	public User(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}


	//アカウント作成時に使用するコンストラクターは未作成



	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}


}//User