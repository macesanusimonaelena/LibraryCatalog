package library;

public class Book {
	// proprietatile cartilor din biblioteca
	private String title;
	private int pageCount;
	private long isbn;
	private boolean checkedOut;
	private boolean reserved;

	public Book(String title, int pageCount, long isbn) {
		this.title = title;
		this.pageCount = pageCount;
		this.isbn = isbn;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
}