
package lab1_p1;

import java.util.Scanner;


public class Lab1_p1 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1;
        System.out.println("input");
          num1=input.nextInt();
         if(num1%6==0){
             System.out.println("False");
         }
          else if (num1%2==0 || num1%3==0){
            System.out.println("True");
        }
            else {
                    System.out.println("False");
                    }
    }
    }

