/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_icecream;


public class ice_cream {
   private String icecreamType; 
   private String icecreamCompany; 
   private double icecreamPrice;
   //defaultConstructor
   public ice_cream(){
       
   }

    public String getIcecreamType() {
        return icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

//constructor
    public ice_cream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }
   

   //toStringFunction
     public String toString(){
         return icecreamType+" "+icecreamCompany+" "+icecreamPrice;
     }
     
     //equals function
     public boolean equals(double obj1){
         if (obj1==icecreamPrice) {
            return true;
         }
         else {
             return false;
         }
     }
     
     //compareTo function
     public int compareTo(double obj1){
         if (icecreamPrice>obj1) {
             return 1;
         }
         else if(icecreamPrice==obj1){
             return 0;
         }
         else{ return -1;
     }
     
}
}