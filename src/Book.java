import java.util.List;

public class Book {
	private String title;

	private int nbPages;

	private List<Author> authors;

	private Gender gender;

	private Category category;
	public Book(String title, int nbPages, List<Author> authors, Gender gender, Category category) {
		this.title = title;
		this.nbPages = nbPages;
		this.authors = authors;
		this.gender = gender;
		this.category = category;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}

	public void removeAuthor(Author author) {
		authors.remove(author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
