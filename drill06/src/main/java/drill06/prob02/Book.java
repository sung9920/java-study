package drill06.prob02;

public class Book {
	private String title;
	private int price;
	
	public void show() {
		System.out.println("\nBook[title=" + title + ", price=" + price + "]");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
