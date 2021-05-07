package lesson5HomeWork1.business.concretes;

import lesson5HomeWork1.business.abstracts.UserService;
import lesson5HomeWork1.business.abstracts.ValidationService;
import lesson5HomeWork1.core.SignUpService;
import lesson5HomeWork1.dataAccess.abstracts.UserDao;
import lesson5HomeWork1.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private SignUpService signUpService;
	private ValidationService validationService;
	

	public UserManager(UserDao userDao, SignUpService signUpService, ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.signUpService = signUpService;
		this.validationService = validationService;
	}

	@Override
	public void signUp(User user) {
		if (validationService.eMailIsVerified(user) == true && validationService.firstNameIsVerified(user) == true
				&& validationService.lastNameIsVerified(user) == true
				&& validationService.passwordIsVerified(user) == true) {
			System.out.println("Email ve şifreniz onaylandı.");
			this.userDao.add(user);
			this.signUpService.signUpToSystem();
		} else {
			System.out.println("Lutfen email ve şifrenizi kontrol edin.");
		}
		
	}

	@Override
	public void logIn(User user, String mail, String password) {
		if (mail == user.getEmail() && password == user.getPassword()) {
			System.out.println("Sisteme giriş yapıldı");
		} else {
			System.out.println("Mail adresinizi veya şifrenizi yanlış girdiniz");
		}
		
	}

}
