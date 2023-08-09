package day_05;

public class SaleDto {
	private int no;
	private String isbn;
	private int quantity;
	
	public SaleDto() {
		// TODO Auto-generated constructor stub
	}

	public SaleDto(int no, String isbn, int quantity) {
		super();
		this.no = no;
		this.isbn = isbn;
		this.quantity = quantity;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "SaleDto [no=" + no + ", isbn=" + isbn + ", quantity=" + quantity + "]";
	}
	
}
