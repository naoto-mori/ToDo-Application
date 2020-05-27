package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;

public class AccountDAO {


	private final String JDBC_URL = "jdbc:mysql://localhost:3306/ToDo_DB?characterEncoding=utf-8&serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "root";


	//idが一致するレコードを探してくるメソッド
	public User selectAccount(User user) {

		//id一致レコードがあれば代入するための変数
		User selectUser = null;



		try ( Connection conn = DriverManager.getConnection(JDBC_URL , DB_USER , DB_PASS ) ) {

			//SQL文(selsct)を記述
			//?はあとから記述
			String sql = " select id, password from account where id=? " ;

			//SQL文を送る
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//?内を記述
			pStmt.setString(1, user.getId() );

			//SQL文の実行結果を取得
			ResultSet rs = pStmt.executeQuery();


			if ( rs != null ) {    //id一致レコードがある

				rs.next();

				//インスタンス生成し情報格納
				String id = rs.getString("id");
				String pass = rs.getString("password");

				selectUser = new User(id, pass);

			} else {
				//処理なし
				//selectUserはnullのまま
			}

		} catch (SQLException e) {

			e.printStackTrace();
			return null;

		}


		return selectUser;


	}//selectAccount()








}//AccountDAO
