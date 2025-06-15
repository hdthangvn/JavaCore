package chapter4;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("run video 28");

		Student st1 = new Student();
		Student st2 = new Student("Eric", 26);
		st2.setName("Duc Thang setName");
		System.out.println("check name " + st2.getName());
		System.out.println("check age: " + st2.getAge());
	}
}
