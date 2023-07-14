// Applying recursion to reverse an array
import java.io.*;
import java.util.*;
class ReverseArray {
    
    static int reverseArray(int[] nums, int start, int end)
    {   
    int temp;
       if(start>=end)
           return 0;
       else
       {
           temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
       }
       
       return reverseArray(nums,start+1, end-1);
    }
    
    public static void main(String[] args) {
        
        int[] nums = { 1,2,3,4,5,6,7,8,9 };
        reverseArray(nums,0,nums.length-1);
        System.out.println("Reverse array is "+Arrays.toString(nums));
    
    }
}
