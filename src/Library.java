import java.util.List;

public class Library {
	private String name;

	private List<Book> books;

	public Library() {
	}

	public Library(String name, List<Book> books) {
		this.name = name;
		this.books = books;
	}

	public void getWriterList() {
		for (Book book : books) {
			List<Author> authors = book.getAuthors();
			for (Author author : authors) {
				if (author instanceof Writer) System.out.println(author.getName());
			}
		}
	}

	public void getDesignerList() {
		for (Book book : books) {
			List<Author> authors = book.getAuthors();
			for (Author author : authors) {
				if (author instanceof Designer) System.out.println(author.getName());
			}
		}
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
