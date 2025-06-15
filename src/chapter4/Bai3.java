package chapter4;

public class Bai3 {
	public static void main(String[] args) {
		Product test = new Product();

		Product pr1 = test.nhapThongTin("computer", 200, 20);
		test.inThongTin(pr1);
		System.out.println("tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}

}
