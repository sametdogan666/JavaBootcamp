package lesson5HomeWork1.core;

import lesson5HomeWork1.GoogleRegistration.GoogleRegistrationManager;

public class GoogleRegistrationManagerAdapter implements SignUpService{

	@Override
	public void signUpToSystem() {
		GoogleRegistrationManager googleRegistrationManager = new GoogleRegistrationManager();
		googleRegistrationManager.signUp();
		
		
	}

}
