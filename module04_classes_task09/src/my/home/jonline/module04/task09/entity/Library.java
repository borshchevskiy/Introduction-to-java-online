package my.home.jonline.module04.task09.entity;

import java.util.ArrayList;
import java.util.List;


public class Library {

	private List<Book> library;

	public Library() {
		library = new ArrayList<>();
	}

	public Library(List<Book> library) {
		this.library = library;
	}

	public void addBook(Book book) {
		library.add(book);
	}

	public void removeBook(Book book) {
		library.remove(book);
	}
	
	public List<Book> getBooks() {
		return library;
	}
}
