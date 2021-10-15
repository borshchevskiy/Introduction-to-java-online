package my.home.jonline.module04.task09.entity;

public class Book {

	private static long idCounter;
	private long id;
	private String title;
	private String authors;
	private String publisher;
	private int year;
	private int numberOfPages;
	private double price;
	private String coverType;
	
	
	public Book() {
		this.id = idCounter++;
	}

	
	public Book(String title, String authors, String publisher, int year, int numberOfPages, double price,
			String coverType) {
		this();
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.coverType = coverType;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCoverType() {
		return coverType;
	}


	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}


	public long getId() {
		return id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((coverType == null) ? 0 : coverType.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + numberOfPages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (coverType == null) {
			if (other.coverType != null)
				return false;
		} else if (!coverType.equals(other.coverType))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", publisher=" + publisher + ", year="
				+ year + ", numberOfPages=" + numberOfPages + ", price=" + price + ", coverType=" + coverType + "]";
	}
	
	
}
