package app.Strategy;

import app.book.Books;

import java.util.List;

public abstract class BookSearch implements BookManager {
	protected List<Books> books;

	public BookSearch(List<Books> books){
		this.books = books;
	}
	@Override
	public void algorithm() {
		for (int i = 0; i < books.size(); i++){
			if (search(books.get(i))){
				finding(i);
				break;
			}
		}
	}
	public abstract void finding(int index);
	public abstract boolean search(Books book);
}
