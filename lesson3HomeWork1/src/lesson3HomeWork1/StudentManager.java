package lesson3HomeWork1;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Öğrenci sisteme eklendi: " + user.getEmail());
	}

	public void login() {
		System.out.println("Öğrenci sisteme giriş yaptı");
	}

	public void logout() {
		System.out.println("Öğrenci sistemden çıkış yaptı");
	}

	public void registeredCourse(int courseId) {
		System.out.println("Öğrenci kursa kaydouldu. Kurs Numarası: " + courseId);
	}

}
