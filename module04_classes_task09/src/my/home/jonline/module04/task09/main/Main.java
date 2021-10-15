package my.home.jonline.module04.task09.main;

import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module04.task09.entity.Book;
import my.home.jonline.module04.task09.entity.Library;
import my.home.jonline.module04.task09.search.Search;
import my.home.jonline.module04.task09.view.View;

/* Простейшие классы и объекты.
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль. 
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
Найти и вывести: 
a) список книг заданного автора; 
b) список книг, выпущенных заданным издательством; 
c) список книг, выпущенных после заданного года.
 */
public class Main {

	public static void main(String[] args) {
		Library javaLibrary = new Library();

		javaLibrary.addBook(new Book("Thinking in Java", "Bruce Eckel", "Piter", 2019, 1168, 2000, "hard cover"));
		javaLibrary.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", "Dialectica", 2018, 1488, 4000,
				"hard cover"));
		javaLibrary.addBook(
				new Book("Java: A Beginner's Guide", "Herbert Schildt", "Dialectica", 2019, 816, 2500, "hard cover"));
		javaLibrary.addBook(new Book("Core Java I", "Cay Horstmann", "Alpha-Book", 2019, 864, 2400, "hard cover"));
		javaLibrary.addBook(new Book("Core Java II", "Cay Horstmann", "Dialectica", 2020, 864, 3000, "hard cover"));

		View view = new View();
		view.viewBooks(javaLibrary);

		
		
		Search search = new Search();
		
		List<Book> horstmannBooks;
		
		horstmannBooks = new ArrayList<>(search.searchByAuthor(javaLibrary, "Cay Horstmann"));
		
		view.viewBooksBrief(horstmannBooks);
		
		
		
		List<Book> dialecticaBooks;
		
		dialecticaBooks = new ArrayList<>(search.searchByPublisher(javaLibrary, "Dialectica"));
		
		view.viewBooks(dialecticaBooks);
		
		
		
		Library newBooks;
		
		newBooks = new Library(search.searchFromYear(javaLibrary, 2019));
		
		view.viewBooksBrief(newBooks);
	}

}
