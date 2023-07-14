public class FactorialUsingRecursion {
    
    static int fact(int n)
    {   //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
        //recursive call
        int reCall = fact(n-1);
        //small calculation
        int result = n*reCall;
        return result;
        }
    }
    
    public static void main(String[] args) {
        
       
        System.out.println( fact(3));
    
    }
}
