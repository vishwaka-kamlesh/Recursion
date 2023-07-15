// Recursion on Subsequences & Subsets

class Subset {
    
    static void subset(String str,String temp,int index)
    {
        if(index==str.length())
            System.out.println(temp);
        else
        {
            //non take
            subset(str, temp,index+1);
            //take
            subset(str,temp+str.charAt(index),index+1);
        }
    }
    public static void main(String[] args) {
        
        subset("abc","",0);
    }
}
