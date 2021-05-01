package lesson3HomeWork1;

public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println("Eğitmen sisteme eklendi: " + user.getEmail());
	}

	public void login() {
		System.out.println("Eğitmen sisteme giriş yaptı");
	}

	public void logout() {
		System.out.println("Eğitmen sistemden çıkış yaptı");
	}

	public void addCourse(String course) {
		System.out.println("Eğitmen sisteme kurs ekledi: " + course);
	}
}
