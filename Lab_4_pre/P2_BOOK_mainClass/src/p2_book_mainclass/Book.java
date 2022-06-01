/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_book_mainclass;


public class Book {
    //object
   private int ISBN;
   private String bookTitle;
   private int numberOfPages;
   private int count ;
   
//get
    public int getISBN() {
        return ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCount() {
        return count;
    }
//bookconstructor&set
    public Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }
    //defaultconstructor
    public Book(){
       
   }
    
   public String toString(){
        return "ISBN: "+ISBN+", Title: "+bookTitle+", Page: "+numberOfPages;
    }
   //compareToMethod
   int compareTo(int page){
       if(page<numberOfPages){
         return 1;
   }
       else if(page==numberOfPages){
       return 0;
   }
       else{
           return -1;
       }
}
}
