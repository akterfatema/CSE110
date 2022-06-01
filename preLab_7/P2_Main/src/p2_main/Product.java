/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_main;
class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }

}
public class Product {
     public void productCheck(int weight)throws MyException{
        if (weight<100) {
            throw new MyException("product is invalid");
        }
        else{
            System.out.println("Weight: "+weight);
        }
    }
}
