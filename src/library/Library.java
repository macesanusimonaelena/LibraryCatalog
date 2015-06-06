package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// lista cu carti din biblioteca
	private List<Book> books;

	public Library() {
		books = new ArrayList<Book>();
		books.add(new Book("Basme", 18, 5634567));
		books.add(new Book("Povestea povestilor", 35, 5792707));

	}

	// imprumut carte din biblioteca
	public Book chechOut(String bookName) {

		Book theBook = null;
		for (Book book : books) {
			if (book.getTitle().equals(bookName)) {
				theBook = book;
				break;
			}
		}
		if (!theBook.isCheckedOut()) {
			theBook.setCheckedOut(true);
		}
		return theBook;
	}

	// retur carte in biblioteca
	public void chechIn(Book theBook) {

		theBook.setCheckedOut(false);
	}

	// rezervare carte in biblioteca
	public void reserved(String bookName) {

		Book theBook = null;
		for (Book book : books) {
			if (book.getTitle().equals(bookName)) {
				theBook = book;
				break;
			}
		}
		if (!theBook.isReserved()) {
			theBook.setReserved(true);
		}
	}
}