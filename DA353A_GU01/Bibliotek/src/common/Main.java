package common;

import login.LoginController;

public class Main {
	public static void main(String[] args) {
		LoginController lc = new LoginController("files/Lantagare.txt");
		lc.startLoginView();
	}
}