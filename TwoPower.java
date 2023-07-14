// WRITE A JAVA PROGRAM TO CALCULATE POWERS OF 2 USING RECURSION

class TwoPower {
    
    static int twoPower(int n)
    {   //base case
        if(n==1)
            return 2;
        else
        {
        //recursive call
        int reCall = twoPower(n-1);
        //small calculation
        int result = 2*reCall;
        return result;
        }
    }
    
    public static void main(String[] args) {
        
       
        System.out.println(twoPower(5));
    
    }
}
