package library_management;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import library_management.models.Book;
import library_management.models.Library;
public class LibraryManagement {
    static Library  library;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Library library = new Library(1, 5);

        while(sc.hasNextLine()){
            String input = sc.nextLine();
            String command = input.split(" ")[0];
            switch (command) {
                case "create_library":
                    System.out.println("--------------------------");
                    int library_id = Integer.parseInt(input.split(" ")[1]) ;
                    int noOfRacks = Integer.parseInt(input.split(" ")[2]);
                    library = new Library(library_id, noOfRacks);
                    System.out.println(String.format("Library created with Id: %d and %d  racks",library_id, noOfRacks));
                    System.out.println("--------------------------");
                    break;

                case "add_book":
                    System.out.println("--------------------------");
                    if(!libraryNullCheck()) continue;
                    //  <book_id> <title> <comma_separated_authors> <publisher> <comma_separated_book_copy_ids>
                    String book_id = input.split(" ")[1];
                    String title = input.split(" ")[2];
                    String[] authors =  input.split(" ")[3].split(",");
                    String publisher = input.split(" ")[4];    
                    String[] bookCopies = input.split(" ")[5].split(",");
                    library.addBook(book_id, title, authors, publisher, bookCopies);
                    System.out.println("--------------------------");
                    break;
                
                case "remove_book_copy":
                    System.out.println("--------------------------");
                    if(!libraryNullCheck()) continue;
                    String bookCopyId = input.split(" ")[1];
                    library.removeBookCopy(bookCopyId);
                    System.out.println("--------------------------");
                    break;

                case "search":
                    String attribute = input.split(" ")[1];
                    String attribute_value = input.split(" ")[2];

                    List<Book> searchItems = library.searchBooks(attribute, attribute_value);
                    if(searchItems==null){
                        System.out.println("Invalid attribute: Please select one from title, author, publisher");
                    }else if(searchItems.isEmpty()){
                        System.out.println("No results found for "+ attribute+"->"+ attribute_value);
                    }else{
                        System.out.println("Search results:");
                        for (Book book : searchItems) {
                            System.out.print(String.format("BookId: %s, Title: %s, Publisher: %s, ", book.id, book.title, book.publisher));
                            System.out.print("Authors: "+ Arrays.toString(book.authors)+", ");
                            System.out.println("Copies: "+ book.bookCopies.keySet());
                        }
                    }

                    break;
            
                case "print_books":
                    System.out.println("--------------------------");
                    if(!libraryNullCheck()) continue;
                    library.printBooks();
                    System.out.println("--------------------------");
                    break;
                
                case "borrow_book_copy":
                    //<book_copy_id> <user_id> <due_date>
                    System.out.println("--------------------------");
                    String book_copy_id = input.split(" ")[1];
                    String user_id = input.split(" ")[2];
                    String due_date = input.split(" ")[3];

                    library.borrowBook(book_copy_id, user_id, due_date);
                    break;

                case "print_borrowed":
                    //<book_copy_id> <user_id> <due_date>
                    System.out.println("--------------------------");
                    String userId = input.split(" ")[1];
                        
                    library.printBorrowed(userId);
                    break;

                case "return_book_copy":
                    //<return_book_copy> <book_copy_id>
                    System.out.println("--------------------------");
                    String book_copyId = input.split(" ")[1];
                    String userID = input.split(" ")[2];
                        
                    library.returnBook(book_copyId, userID);
                    break;

                case "exit":
                System.out.println("Bye!");
                System.exit(0);
                    break;
                    
                default:
                    break;
            }
        }
    }

    public static boolean libraryNullCheck(){
        if(library==null){
            System.out.println("Please create library first!");
            System.out.println("--------------------------");
            return false;
        }else{
            return true;
        }
    }
}

//Test cases given below

//create_library 1 2
//add_book 1 SD A,B PUB1 101,102
//add_book 2 DSA C,D,B PUB2 201,202,203,204
//print_books
//remove_book_copy 203
//remove_book_copy 201
//print_books
//add_book 3 OS A,B,E PUB3 301,302
//search title OS
//search author A
//borrow_book_copy 101 1 5Nov
//print_borrowed 1
//return_book_copy 101 1