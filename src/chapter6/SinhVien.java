package chapter6;

public abstract class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	abstract void tinhDiem();

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("run info from parent");
	}

}
