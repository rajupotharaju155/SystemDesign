package library_management.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    int libraryId;
    int noOfRacks;
    Map<String, Book> booksMap;
    Map<String, Rack> racksMap;
    Map<String, Pair> bookCopiesMap; 
    Map<String, User> usersMap;
    //holding bookCopiesMap separately for faster lookup -  if a given copy is available, 
    //if available get its parent bookId and where it is racked!
    

    public Library(int libraryId, int noOfRacks){
        this.libraryId = libraryId;
        this.noOfRacks = noOfRacks;
        booksMap = new HashMap<>();
        racksMap = new HashMap<>();
        bookCopiesMap = new HashMap<>();
        usersMap = new HashMap<>();
        for(int i=0; i<noOfRacks; i++){
            Rack rack = new Rack(Integer.toString(i), new HashMap<>());
            racksMap.put(Integer.toString(i), rack);
        }
    }

    public void addBook(String bookId, String title, String[] authors, String publication, String[] bookCopies){
        Book book;
        if(booksMap.containsKey(bookId)){
            System.out.println("Book already exists");
            return;
        }
        
        Map<String, String> filteredBookCopies = new HashMap<>(); //new bookCopy list, so it can hold only those copies that were racked!
        for (String bookCopyId : bookCopies) {
            for (Map.Entry<String, Rack> rackSet: racksMap.entrySet()) {
                Rack rack = rackSet.getValue();
                if(!rack.bookCopies.containsKey(bookId)){
                    //insert into rack
                    rack.bookCopies.put(bookId, bookCopyId);
                    //insert into bookCopy with bookId and RackId
                    bookCopiesMap.put(bookCopyId, new Pair(bookId, rack.id));
                    //insert into local filteredBookCopies
                    filteredBookCopies.put(bookCopyId, bookId);
                    break;
                }
            }
        }
        //insert into booksMap
        book = new Book(bookId, title, authors, publication, filteredBookCopies);
        booksMap.put(bookId, book);
        System.out.println("Book Added with "+ filteredBookCopies.size() +" copies");
    }

    public void removeBookCopy(String bookCopyId){
        if(!bookCopiesMap.containsKey(bookCopyId)){
            System.out.println("bookCopyId: "+ bookCopyId+" Not found");
            return;
        }
        String bookId = bookCopiesMap.get(bookCopyId).bookId; 
        String rackId = bookCopiesMap.get(bookCopyId).rackId;
        //remove from bookCopiesMap
        if(bookCopiesMap.containsKey(bookCopyId)){
            bookCopiesMap.remove(bookCopyId);
        }
        //remove from booksMap
        if(booksMap.containsKey(bookId)){
            booksMap.get(bookId).bookCopies.remove(bookCopyId);
        }
        //remove from racksMap
        if(racksMap.containsKey(rackId)){
            racksMap.get(rackId).bookCopies.remove(bookId);
        }
        System.out.println("bookCopyId: "+ bookCopyId+" Removed succesfully");
    }

    public void printBooks(){
        if(booksMap.isEmpty()){
            System.out.println("No books available");
            return;
        }
        System.out.println("Printing book with its copies");
        for (Map.Entry<String, Book> book: booksMap.entrySet()) {
            System.out.println("BookId: "+book.getKey()+" Title: "+book.getValue().title+" BookCopies: "+ book.getValue().bookCopies.keySet() );            
            for (Map.Entry<String, Rack> rackSet: racksMap.entrySet()) {
                Rack rack = rackSet.getValue();
                if(rack.bookCopies.containsKey(book.getKey())){
                    System.out.println("Rack no: "+ rack.id+" BookCopy: "+ rack.bookCopies.get(book.getKey()));
                }
            }
            System.out.println("***************");
        }

        // System.out.println("All copies at a glance: ");
        // for (Map.Entry<String, Pair> bookCopy: bookCopiesMap.entrySet()) {
        //     System.out.println(bookCopy+" | "+ bookCopy.getValue().bookId+" | "+ bookCopy.getValue().rackId);
        // }
    }

    public List<Book> searchBooks(String attribute, String attributeValue){
        List<Book> searchItems = new ArrayList<>();
        if(attribute.equals("title")){
            for(Map.Entry<String, Book> book: booksMap.entrySet()){
                if(book.getValue().title.equals(attributeValue))
                    searchItems.add(book.getValue());
            }
        }else if(attribute.equals("author")){
            for(Map.Entry<String, Book> book: booksMap.entrySet()){
                if(Arrays.asList(book.getValue().authors).contains(attributeValue))
                    searchItems.add(book.getValue());
            }
        }else if(attribute.equals("publisher")){
            for(Map.Entry<String, Book> book: booksMap.entrySet()){
                if(book.getValue().publisher.equals(attributeValue))
                    searchItems.add(book.getValue());
            }
        }else{
            return null;
        }
        return searchItems;
    }

    public void borrowBook(String bookCopyId, String userId, String date){
        if(!bookCopiesMap.containsKey(bookCopyId)){
            System.out.println("bookCopyId: "+ bookCopyId+" Not found");
            return;
        }

        if(bookCopiesMap.get(bookCopyId).dueDate!=null){
            System.out.println("bookCopyId: "+ bookCopyId+" is not available for borrow");
        }

        bookCopiesMap.get(bookCopyId).dueDate = date;
        User user;
        if(!usersMap.containsKey(userId)){
            user = new User(userId);
            usersMap.put(userId, user);
        }else{
            user = usersMap.get(userId);
        }
        user.borrowed_books.put(bookCopyId, date);
        System.out.println("BookCopy borrowed succesfully");
    }

    public void printBorrowed(String userId){
        if(!usersMap.containsKey(userId)){
            System.out.println("userId: "+ userId+" Not found");
            return;
        }
        System.out.println("userId: "+ userId +", Borrowed Books: "+ usersMap.get(userId).borrowed_books.keySet());
    }

    public void returnBook(String bookCopyId, String userId){
        if(!bookCopiesMap.containsKey(bookCopyId)){
            System.out.println("bookCopyId: "+ bookCopyId+" Invalid");
            return;
        }
        if(!usersMap.containsKey(userId)){
            System.out.println("userId: "+ userId+" Invalid");
            return;
        }
        //mark dueDate as null, so its available for next borrow
        bookCopiesMap.get(bookCopyId).dueDate = null;
        //remove from users borrow list
        usersMap.get(userId).borrowed_books.remove(bookCopyId);
        System.out.println("BookCopy returned succesfully");
    }
}


class Pair{
    String bookId;
    String rackId;
    String dueDate;
    public Pair(String bookId, String rackId) {
        this.bookId = bookId;
        this.rackId = rackId;
    }
}
// outer loop -> For Each BookCopy
// inner loop -> For Each Rack (BookId exists?) ? skip: add(copy)
