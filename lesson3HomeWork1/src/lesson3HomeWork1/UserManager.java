package lesson3HomeWork1;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanıcı sisteme eklendi: " + user.getEmail());
	}

	public void login() {
		System.out.println("Sisteme giriş yapıldı");
	}

	public void logout() {
		System.out.println("Sistemden çıkış yapıldı");
	}

}
