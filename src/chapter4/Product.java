package chapter4;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void inThongTin(Product pd) {
		// tinh dong goi
		System.out.println("name = " + pd.getName() + " price= " + pd.getPrice() + " tax=" + pd.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

}
