package chapter6;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao user name: ");
//		String username = sc.nextLine();
//		System.out.println("Nhap Password: ");
//		String password = sc.nextLine();
//		if (password.length() > 6 && username.equals("Thang")) {
//			System.out.println("Ky tu hop le");
//		}
//
//		sc.close();

		Student st1 = new Student("thang", "1");
		Student st2 = new Student("Nguyen duc", "2");
		Student st3 = new Student("hoang", "3");
		Student st4 = new Student("kien", "4");
		Student st5 = new Student("anh", "5");

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println("start with Nguyen: " + arr.get(i));
			}
		}

		System.out.println(">>" + arr);

	}
}
