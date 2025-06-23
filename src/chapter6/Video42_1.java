package chapter6;

public class Video42_1 {
	public static void main(String[] args) {
		SinhVienIT st1 = new SinhVienIT("java", "1", "thang", 10, 0.1);
		// st1.getMoney();
		System.out.println("st 1 check = " + st1.id);
		// st1.info(); // no se goi thang con
		// Vidu nay giong vidu cu, sv1 lay dc tat ca cac thuoc tinh

		SinhVienCoKhi st2 = new SinhVienCoKhi("machine", "2", "duc", 10, 0.1);
		System.out.println("st 2 check = " + st2.name);
	}
}

// super : we use the super function to call a method of the parent
// super : we use the super function to call the constructor of the parent
// node: the child inherits this method, attribute . But it does not inherit the construction of the parent => nen dung super