package p2;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a= ");
		int a = sc.nextInt();
		System.out.println("Nhap b= ");
		int b = sc.nextInt();
		System.out.println("Max = " + Math.max(a, b));

	}

}
