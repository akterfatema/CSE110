
package l2_function;


public class L2_function {
public static int AddNumbers(int source, int dest)
{
int res=0;
for(int i=source;i<dest;i++)
{res +=i;
}
return res;
}
    
    public static void main(String[] args) {
       int res= AddNumbers(10,20);
        System.out.println(res);
        
    }
    
}
