package login;

import common.GeneralController;

public class LoginController extends GeneralController{
	public LoginController(String filePathPersons){
		super(filePathPersons);
		
	}
	
	public void startLoginView(){
		super.loadWindow(new LoginView(), "Logga in");
	}
}
