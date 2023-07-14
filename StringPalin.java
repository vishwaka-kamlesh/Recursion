// Applying recursion to check if a string is a palindrome or not 

class StringPalin{
    //function to check palindrome 
    static int stringPalindrome(String s , int start, int end)
    {   
        if(start>=end)
            return 1;
        else if(s.charAt(start) != s.charAt(end) )
            return 0;
        else
            return stringPalindrome(s,(start+1),(end-1));
    }
    
    public static void main(String[] args) {
        
        String s = "abcba";
        int result = stringPalindrome(s,0,s.length()-1);
        if(result==1)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    
    }
}
