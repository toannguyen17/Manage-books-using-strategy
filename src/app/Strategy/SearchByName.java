package app.Strategy;

import app.book.Books;

import java.util.List;

public class SearchByName extends BookSearch{
	String name;
	public SearchByName(List<Books> books, String name){
		super(books);
		this.name = name;
	}
	@Override
	public boolean search(Books book) {
		return book.getName().equals(name);
	}

	@Override
	public void finding(int index) {
		System.out.println("Search Name - " + name);
	}
}
