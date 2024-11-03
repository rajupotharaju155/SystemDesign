package library_management.models;

import java.util.HashMap;
import java.util.Map;

public class User {
    public String id;
    public Map<String, String> borrowed_books;
    public User(String id) {
        this.id = id;
        this.borrowed_books = new HashMap<>();
    }
}
