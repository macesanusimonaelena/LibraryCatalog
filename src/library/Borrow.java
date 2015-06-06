package library;

public class Borrow {

	public static void main(String[] args) {

		Library library = new Library();
		Book book = library.chechOut("Basme");
		System.out.println(book.getIsbn());
		library.chechIn(book);
	}
}
