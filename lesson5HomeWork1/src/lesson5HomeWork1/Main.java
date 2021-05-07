package lesson5HomeWork1;

import lesson5HomeWork1.business.abstracts.EMailService;
import lesson5HomeWork1.business.abstracts.UserService;
import lesson5HomeWork1.business.concretes.EMailManager;
import lesson5HomeWork1.business.concretes.UserManager;
import lesson5HomeWork1.business.concretes.ValidationManager;
import lesson5HomeWork1.core.DefaultRegistrationManager;
import lesson5HomeWork1.core.GoogleRegistrationManagerAdapter;
import lesson5HomeWork1.dataAccess.concretes.HibernateUserDao;
import lesson5HomeWork1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User samet = new User(1,"Samet","Dogan","samet@samet.com","123456");
		User alihan = new User(2, "Alihan", "Kirpik", "alihan@alihan.com", "123123");

		UserService userService = new UserManager(new HibernateUserDao(), new DefaultRegistrationManager(), new ValidationManager());
		UserService userServiceGoogle = new UserManager( new HibernateUserDao(),new GoogleRegistrationManagerAdapter(),new ValidationManager());

		EMailService eMailService = new EMailManager();

		userService.signUp(samet);
		eMailService.send();
		eMailService.verify();

		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		userServiceGoogle.signUp(alihan);
		eMailService.send();
		eMailService.verify();
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		userService.logIn(samet, "samet@samet.com","123456");
		userService.logIn(alihan, "alihan@alihan.com", "1234");

	}

}
