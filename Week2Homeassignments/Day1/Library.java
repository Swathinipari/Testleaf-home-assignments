package org.testleaf.Week2.Homeassignments.Day1;

public class Library {
    public String addBook(String bookTitle){
        
        System.out.println("Book added successfully");
        return("bookTitle");
        
    }
    public void issueBook(String issueBook){
        System.out.println("Book issued Successfully");
        
    }
    

    public static void main(String[] args) {
        Library libraryData = new Library();
        libraryData.addBook(null);
        libraryData.issueBook(null);

        
        
    }

}
