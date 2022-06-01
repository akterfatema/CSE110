
package l2.function;


public class L2Function {

   public static void AddNumbers(int source,int dest)
   { int res=0; 
      for(int i=source;i<dest;i++)
      {
          res += i;
      }
       System.out.println(res);
   }
    public static void main(String[] args) {
        
        AddNumbers(10,20);
    }
    
}
