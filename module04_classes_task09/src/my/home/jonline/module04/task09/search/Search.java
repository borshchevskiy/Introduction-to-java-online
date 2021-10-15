package my.home.jonline.module04.task09.search;

import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module04.task09.entity.Book;
import my.home.jonline.module04.task09.entity.Library;

public class Search {

	public List<Book> searchByYear(List<Book> books, int year) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : books) {
			if (book.getYear() == year) {
				result.add(book);
			}
		}

		return result;
	}

	public List<Book> searchByYear(Library library, int year) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : library.getBooks()) {
			if (book.getYear() == year) {
				result.add(book);
			}
		}

		return result;
	}
	
	public List<Book> searchByYearRange(List<Book> books, int yearStart, int yearEnd) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : books) {
			if (book.getYear() >= yearStart && book.getYear() <= yearEnd) {
				result.add(book);
			}
		}

		return result;
	}

	public List<Book> searchByYearRange(Library library, int yearStart, int yearEnd) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : library.getBooks()) {
			if (book.getYear() >= yearStart && book.getYear() <= yearEnd) {
				result.add(book);
			}
		}

		return result;
	}
	
	
	public List<Book> searchFromYear(List<Book> books, int yearStart) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : books) {
			if (book.getYear() >= yearStart) {
				result.add(book);
			}
		}

		return result;
	}

	public List<Book> searchFromYear(Library library, int yearStart) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : library.getBooks()) {
			if (book.getYear() >= yearStart) {
				result.add(book);
			}
		}

		return result;
	}
	
	public List<Book> searchUpToYear(List<Book> books, int yearEnd) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : books) {
			if (book.getYear() <= yearEnd) {
				result.add(book);
			}
		}

		return result;
	}

	public List<Book> searchUpToYear(Library library, int yearEnd) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : library.getBooks()) {
			if (book.getYear() <= yearEnd) {
				result.add(book);
			}
		}

		return result;
	}
	
	public List<Book> searchByAuthor(Library library, String Author) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : library.getBooks()) {
			if (book.getAuthors().equals(Author)) {
				result.add(book);
			}
		}

		return result;
	}
	
	public List<Book> searchByPublisher(List<Book> books, String Publisher) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : books) {
			if (book.getPublisher().equals(Publisher)) {
				result.add(book);
			}
		}

		return result;
	}
	
	public List<Book> searchByPublisher(Library library, String Publisher) {
		List<Book> result;

		result = new ArrayList<>();

		for (Book book : library.getBooks()) {
			if (book.getPublisher().equals(Publisher)) {
				result.add(book);
			}
		}

		return result;
	}

}
