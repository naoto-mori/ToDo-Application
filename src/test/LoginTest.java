package test;

import java.util.Scanner;

import beans.User;
import model.LoginLogic;


//User , AccoutDAO(selectのみ) , LoginLogicの動作テストを行うプログラム
public class LoginTest {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("ID入力：");
		String testId = sc.nextLine();
		System.out.println("password入力：");
		String testPass = sc.nextLine();

		User testUser = new User(testId,testPass);


		LoginLogic loginLogic = new LoginLogic();

		boolean result = loginLogic.execute(testUser);

		System.out.println(result);

	}//main()

}//class
