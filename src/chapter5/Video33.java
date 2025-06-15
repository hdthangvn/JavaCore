package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Video33 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		double Sum = 0;
		while (true) {
			Double a = sc.nextDouble();
			list.add(a);
			sc.nextLine();
			System.out.println("Nhap them (Y?N) ?");
			if (sc.nextLine().trim().equalsIgnoreCase("N")) {

				break;
			}
		}

		System.out.println("check list" + list);
		for (Double x : list) {
			Sum += x;
		}

		System.out.println(Sum);

	}
}
