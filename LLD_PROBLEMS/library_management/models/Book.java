package library_management.models;

import java.util.Map;

public class Book{
    public String id;
    public String title;
    public String[] authors;
    public String publisher;
    public Map<String, String> bookCopies;
    
    public Book(String id, String title, String[] authors, String publisher, Map<String, String> bookCopies) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.bookCopies = bookCopies;
    }

}