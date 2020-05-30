package app.Strategy;

import app.book.Books;

import java.util.List;

public class DeleteByName extends SearchByName {

	public DeleteByName(List<Books> books, String name) {
		super(books, name);
	}

	@Override
	public void finding(int index) {
		books.remove(index);
		System.out.println("remove book: " + name);
	}
}
