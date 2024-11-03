package library_management.models;

import java.util.HashMap;

public class Rack {
    String id;
    HashMap<String, String> bookCopies;

    public Rack(String id, HashMap<String, String> bookCopies) {
        this.id = id;
        this.bookCopies = bookCopies;
    }
}
