package my.home.jonline.module04.task09.view;

import java.util.List;

import my.home.jonline.module04.task09.entity.Book;
import my.home.jonline.module04.task09.entity.Library;

public class View {

	public void viewBook(Book book) {
		System.out.println(book.getTitle() + ", " + book.getAuthors() + ", " + book.getYear() + ", " + book.getNumberOfPages() + ", "
				+ book.getPublisher()+ ", " + book.getCoverType() + ", " + book.getPrice());
	}
	
	
	public void viewBookBrief(Book book) {
		System.out.println(book.getTitle() + ", " + book.getAuthors() + ", " + book.getYear() + ".");
	}
	
	
	public void viewBooks(Library library) {
		for (Book book : library.getBooks()) {
			viewBook(book);
		}
		System.out.println();
	}
	
	public void viewBooks(List<Book> books) {
		for (Book book : books) {
			viewBook(book);
		}
		System.out.println();
	}
	
	public void viewBooksBrief(Library library) {
		for (Book book : library.getBooks()) {
			viewBookBrief(book);
		}
		System.out.println();
	}
	
	public void viewBooksBrief(List<Book> books) {
		for (Book book : books) {
			viewBookBrief(book);
		}
		System.out.println();
	}
}
