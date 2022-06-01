/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivities_2;

/**
 *
 * @author Fatema
 */
public class IcecreamLabActivities2 {
    private String icecreamType; 
   private String icecreamCompany; 
   private double icecreamPrice;
   //defaultConstructor
   public IcecreamLabActivities2(){
       
   }

   
//constructor&set
    public IcecreamLabActivities2(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }
   

   //toStringFunction
     public String toString(){
         return icecreamType+" "+icecreamCompany+" "+icecreamPrice;
     }
     
     //equals function
     public boolean equals(IcecreamLabActivities2 arr){
         if (arr.icecreamPrice==icecreamPrice) {
            return true;
         }
         else {
             return false;
         }
     }
     
     //compareTo function
     public int compareTo(IcecreamLabActivities2 arr){
         if (icecreamPrice>arr.icecreamPrice) {
             return 1;
         }
         else if(icecreamPrice==arr.icecreamPrice){
             return 0;
         }
         else{ return -1;
     }
     
}
}
