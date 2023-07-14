
class FibonacciUsingRecursion {
    
    static int fibonac(int n)
    {   //base case
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
        {
        //recursive call
        int reCall = fibonac(n-1);
        //small calculation
        int result =  fibonac(n-2) + reCall;
        return result;
        }
    }
    
    public static void main(String[] args) {
        
       
        System.out.println( fibonac(6));
    
    }
}
