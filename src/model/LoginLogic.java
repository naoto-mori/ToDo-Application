package model;

import beans.User;
import dao.AccountDAO;

public class LoginLogic {

	public boolean execute(User user) {

		AccountDAO dao = new AccountDAO();

		//主キー(id)が一致するレコードがあればUser型インスタンスが戻るため、
		//User型selectUserインスタンスに格納
		//該当レコードがなければnullが戻る

		User selectUser = dao.selectAccount(user);


		//id一致ユーザーなし
		if(selectUser == null) {

			System.out.println("AccountDAOからnullが戻りました");
			return false;

		}



		//id一致ユーザーあり

		String inputPass = user.getPass();

		if ( inputPass.equals(selectUser.getPass()) ) {

			//passも一致
			return true;

		} else  {

			//passが違う
			return false;

		}


	}//execute()

}//LoginLogic