/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_lab2_p3;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P_lab2_p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner af=new Scanner(System.in);
     String word=af.next();
     int n=word.length();
      int count =0;
      int i=0,j=n-1;
      while(i<j){
          if(word.charAt(i)!=word.charAt(j)){
          count++;
      }
       i++;
       j--;
    }
      if(count>0){
          System.out.println("not palindrome");
      }
      else{
          System.out.println("palindrome");
      }  
   
    
    


}
}