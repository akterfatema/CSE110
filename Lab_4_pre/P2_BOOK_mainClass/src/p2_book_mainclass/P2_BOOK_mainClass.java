/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_book_mainclass;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P2_BOOK_mainClass {
    public static void displayAll(Book[]obj) {
        for (int i = 0; i < obj.length; i++) {
             System.out.println(obj[i].getISBN() +" "+obj[i].getBookTitle()+" "+obj[i].getNumberOfPages());
            
        }
    }
    
    //isHeavierMethod
public static boolean isHeavier(int pages){
    if (pages>500) {
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String[] args) {
        //input
        Scanner af=new Scanner(System.in);
        //array
        Book[] obj=new Book[5];
        for (int i = 0; i < obj.length; i++) {
            int isbn=af.nextInt();
            String title=af.next();
            int page=af.nextInt();
            obj[i]=new Book(isbn,title,page);
        }
        System.out.println("");//for space
        displayAll(obj);
        System.out.println("Number 2 book information: ");
        System.out.println(obj[1].toString());
        
        //compareToMethod
       int com= obj[3].compareTo(obj[4].getNumberOfPages());
        if (com==1) {
            System.out.println(obj[3].getBookTitle()+" has more pages" );
        }
        else if(com==0){
            System.out.println("Both books have same pages");
    }
        else{
            System.out.println(obj[4].getBookTitle() +" has more pages");
        }
        //isHeavierMethod&print
        if (isHeavier(obj[2].getNumberOfPages())==true) {
            System.out.println(obj[2].getBookTitle()+" has more than 500 pages");
        }
        else{
             System.out.println(obj[2].getBookTitle()+" has less than 500 pages");
        }
}
}
/*input
1 amitopu 300
2 misirali 220
3 Shatkahon 1300
4 misiralirchosma 120
5 opekkha 500
*/