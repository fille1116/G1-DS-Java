package login;

import javax.swing.JFrame;

import common.GeneralController;

public class LoginController extends GeneralController{
	public static void main(String[] args) {
		LoginController lc = new LoginController();
		lc.startupJFrame();
	}
	
	private void startupJFrame(){
		JFrame frame = new JFrame();
		frame.add(new LoginView());
	}
}
