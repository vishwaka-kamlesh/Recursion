// Count Ways to Reach Nth Stair Problem!

class StairProblem {
    
    static int stairCount(int n)
    {   //base case
        if(n==1 || n==2)
            return n;
        else
        {
        //recursive call
        int reCall1 = stairCount(n-1);
         int reCall2 = stairCount(n-2);
        //small calculation
        int result = reCall1+reCall2;
        return result;
        }
    }
    
    public static void main(String[] args) {
        
       
        System.out.println(stairCount(5));
    
    }
}
