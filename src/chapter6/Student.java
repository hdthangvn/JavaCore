package chapter6;

/**
 * 
 */
/**
 * 
 */
public class Student {
	private String name;
	private String id;

	public Student(String name2, String id2) {
		this.name = name2;
		this.id = id2;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
