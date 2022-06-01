/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_password;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P2_Password {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String password = null;
        System.out.print("Enter password : ");

        password = sc.nextLine();
        if (password.length()>=8) {
            if (checkPass(password)) {
            System.out.println("Valid password");
        } 
        else {
            System.out.println("Invalid password");
        }
        }
        else{
            System.out.println("Enter atleast 8 characters");
        }
        
    }
    public static boolean checkPass(String password) {


        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9'){
                cnt1++;
            }
            if ((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
                cnt2++;
            }
            
        }


        if (cnt1 >= 2 && cnt2 >= 1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    
}

    
    

