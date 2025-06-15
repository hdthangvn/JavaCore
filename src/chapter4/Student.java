package chapter4;

public class Student {

	// class attributes
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name1, int age1) {
		this.name = name1;
		this.age = age1;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// class method
	private void learnJava() {
		System.out.println("Learn java");
	}
}
