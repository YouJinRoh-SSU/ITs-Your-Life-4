package Workshop;

public class Library extends MyItem{

	private String publisher;

	public Library(int itemNo, String title, int price, String publisher, int quantity) {
		super(itemNo, title, price, quantity);
		this.publisher = publisher;
	}

}