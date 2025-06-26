package chapter9;

import java.util.Scanner;

public class Video56 {
	public static int nhapMavs() {
		int result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap ma sv: ");
			try {
				result = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("ma so sv ko hop le, nhap vao so nguyen");
				sc.next();
			}
			// TODO: handle exception
		}
		sc.close();
		return result;
	}

	public static void main(String[] args) {
		System.out.println("video 56");
		try (Scanner sc = new Scanner(System.in)) {
			int masv = nhapMavs();
			System.out.println("ma so sinh vien = " + masv);
		}

	}

}
