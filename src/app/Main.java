package app;

import app.Strategy.BookManager;
import app.Strategy.DeleteByName;
import app.Strategy.SearchByAuthor;
import app.Strategy.SearchByName;
import app.book.Books;
import app.book.ProgrammingBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create 5 ProgrammingBook
        ProgrammingBook javaProgrammingBook_volume1 = new ProgrammingBook("javaC0320H1", "JavaPro Volume 1", 100000.0d, "RedT", "Java", "CodeGym");
        ProgrammingBook javaProgrammingBook_volume2 = new ProgrammingBook("javaC0320H1", "JavaPro Volume 2", 110000.0d, "RedT", "Java", "CodeGym");
        ProgrammingBook phpProgrammingBook = new ProgrammingBook("phpC0320H1", "PHP All in 1", 120000.0d, "RedT", "Php", "CodeGym");
        ProgrammingBook javaProgrammingBook_all = new ProgrammingBook("javaC0320H1", "Java ALl in 1", 130000.0d, "RedT", "Java", "CodeGym");
        ProgrammingBook javascriptProgrammingBook = new ProgrammingBook("javaC0320H1", "JavaScript All in 1", 140000.0d, "RedT", "JavaScript", "CodeGym");

        List<Books> listProgrammingBook = new ArrayList<>();
        listProgrammingBook.add(javaProgrammingBook_volume1);
        listProgrammingBook.add(javaProgrammingBook_volume2);
        listProgrammingBook.add(phpProgrammingBook);
        listProgrammingBook.add(javaProgrammingBook_all);
        listProgrammingBook.add(javascriptProgrammingBook);

        // Deploy Strategy
        BookManager searchByName   = new SearchByName(listProgrammingBook, "Java ALl in 1");
        BookManager searchByAuthor = new SearchByAuthor(listProgrammingBook, "RedT");
        BookManager deleteByName   = new DeleteByName(listProgrammingBook, "Java ALl in 1");

        BookManager[] algorithm = {searchByName, searchByAuthor, deleteByName};

        for (BookManager bookManager: algorithm){
            bookManager.algorithm();
        }

        System.out.println("List after deletion:");
        show(listProgrammingBook);
    }
    public static void show(List<Books> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}
