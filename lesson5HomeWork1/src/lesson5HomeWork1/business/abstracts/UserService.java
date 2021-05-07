package lesson5HomeWork1.business.abstracts;

import lesson5HomeWork1.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void logIn(User user, String mail, String password);

}
