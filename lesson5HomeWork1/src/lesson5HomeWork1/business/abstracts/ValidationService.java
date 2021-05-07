package lesson5HomeWork1.business.abstracts;

import lesson5HomeWork1.entities.concretes.User;

public interface ValidationService {
	boolean passwordIsVerified(User user);
	boolean eMailIsVerified(User user);
	boolean firstNameIsVerified(User user);
	boolean lastNameIsVerified(User user);
}
