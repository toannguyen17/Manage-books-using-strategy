package app.Strategy;

import app.book.Books;

import java.util.List;

public class SearchByAuthor extends BookSearch {
	String author;
	public SearchByAuthor(List<Books> books, String author){
		super(books);
		this.author = author;
	}

	@Override
	public boolean search(Books book) {
		return book.getAuthor().equals(author);
	}

	@Override
	public void finding(int index) {
		System.out.println("Search Author - " + author + " - " + books.get(index).getName());
	}
}
