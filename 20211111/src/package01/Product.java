package package01;

public class Product {
	String proname;
	int price;
	String kind;
	int qty;
	public Product() {}
	public Product(String proname, int price, String kind, int qty) {
		super();
		this.proname = proname;
		this.price = price;
		this.kind = kind;
		this.qty = qty;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
