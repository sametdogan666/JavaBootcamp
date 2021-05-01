package lesson3HomeWork1;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("123456");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.login();
		instructorManager.logout();
		instructorManager.addCourse("Java + React");

		System.out.println();
		System.out.println("*******************");
		System.out.println();

		Student student = new Student();
		student.setId(2);
		student.setFirstName("Samet");
		student.setLastName("Doğan");
		student.setEmail("samet@samet.com");
		student.setPassword("123123");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.login();
		studentManager.logout();
		studentManager.registeredCourse(1);

	}

}
