package chapter6;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String langauge, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void getMoney() {
		System.out.println("run get money");
		super.info(); // super keyword: dung dc du lieu tu thang cha,
		// luon goi tu thang cha, con neu this.info() thi se chay o thang con
	}

	public void info() {
		System.out.println("run info from parent");
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

}
