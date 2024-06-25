package com.temp.practice.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] arg = {3};
       sort(arg);
    }
    
    public static void sort(int[] nums) {
    	int i = 0;
    	boolean loopFlag = true;
    	boolean shiftFlag = false;
    	//[3,6,2,1]
    	//[3,2,6,1]
    	//[2,3,1,6]
    	//
    	while(loopFlag) {
    		if(i < nums.length) {
    			if(nums[i] > nums[i+1]) {
    				int shiftValue = nums[i];
    				nums[i] = nums[i+1];
    				nums[i+1] = shiftValue;
    				shiftFlag = true;    				   				
    			}else if (i == (nums.length - 2) && shiftFlag == true) {
        			shiftFlag = false;
        			i=0;
        		} else if (i == (nums.length - 2) && shiftFlag == false) {
        			loopFlag = false;
        			System.out.println(nums[0]);
        			System.out.println(nums[nums.length-1]);
        		} else if (i < nums.length) {
        			i++;
        		}
    		}
    	}
    }
}
