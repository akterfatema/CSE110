/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivities_1;

/**
 *
 * @author Fatema
 */
public class IcecreamLab1 {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;
//deafult constructor
    public IcecreamLab1() {
    }
    

   /* public IcecreamLab1(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }*/
    

    public String getIcecreamType() {
        return icecreamType;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }
    public String toString(){
      return icecreamType+" "+icecreamCompany+" "+icecreamPrice;   
    }
     public boolean equals(  IcecreamLab1 iceC_2 ){
         if (icecreamPrice==iceC_2.icecreamPrice) {
            return true;
         }
         else {
             return false;
         }
     }
   public int compareTo( IcecreamLab1 iceC_2 ){
       if (icecreamPrice>iceC_2.icecreamPrice) {
           return 1;
       }
       else if (icecreamPrice==iceC_2.icecreamPrice) {
           return 0;
       }
       else{
           return -1;
       }
   }
   
   
}
