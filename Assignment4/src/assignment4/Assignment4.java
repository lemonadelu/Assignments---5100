package assignment4;

import java.util.Arrays;

public class Assignment4 {
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
	public static int firstUniqChar(String s) {
		int count[] = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++; //count the occurrence of each character in the string
		}
		for(int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i) - 'a'] == 1) { //get the first character that has one an occurrence
				return i;
			}
		}
		return -1;
	}
	
	/*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
	public static int addDigits(int n) {
		if(n / 10 == 0) {
			return n;
		}
		int sum = 0;
		int remainder = 0;
		while(n / 10 != 0) {
			remainder = n % 10;
			n = n / 10;
			
			sum = n + remainder;
			n = sum;
			sum = 0;
		}
		return n;
	}
	
	 /*
     *  Given an array nums, write a function to move all 0's 
     *  to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
    	
    	if(nums == null || nums.length == 0) return;
    	int i = 0;
    	for(int num: nums) {
    			if(num != 0) {
    				nums[i++] = num;
    			}
    	}
    	while(i < nums.length) {
    			nums[i++] = 0;
    		}
    	System.out.println(Arrays.toString(nums));
    }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public static String longestPalindrome(String s) {
		int n = s.length();
		String result = null;
		if(n == 0) {
			return "do not exist";
		}
		if(n < 2) {
			return s;
		}
		boolean[][] dp = new boolean[n][n];
		for(int i = n - 1; i >= 0; i--) {
			for(int j = i; j < n; j++) {
				dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1]);
				if(dp[i][j] && (result == null || j - i + 1 > result.length())) {
					result = s.substring(i, j+1);
				}
			}
		}
		return result;
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public static int[][] rotate(int[][] matrix) {
    		for(int i = 0; i < matrix.length; i++) {
    			for(int j = i; j < matrix[0].length; j++) {
    				int temp = 0;
    				temp = matrix[i][j];
    				matrix[i][j] = matrix[j][i];
    				matrix[j][i] = temp;
    			}
    		}
    		for(int i = 0; i < matrix.length; i++) {
    			for(int j = 0; j < matrix.length/2; j++) {
    				int temp = 0;
    				temp = matrix[i][j];
    				matrix[i][j] = matrix[i][matrix.length - 1 - j];
    				matrix[i][matrix.length - 1 - j] = temp;
    			}
    		}
    		for(int i = 0; i < matrix.length; i++) {
    			for(int j = 0; j < matrix[i].length; j++) {
    				System.out.print(matrix[i][j]+" ");
    			}
    			System.out.println(" ");
    		}
    		return matrix;
   }
    
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println("The index of first non-repeating character of "+ s +" is "+firstUniqChar(s));
		int n = 38;
		System.out.println("Adding all the digits of "+ n + " and the result is "+addDigits(n));
		int nums[] = {0,1,0,3,12};
		System.out.print("Move all the zeroes of "+Arrays.toString(nums)+" to its end and the result is ");
		moveZeroes(nums);
		String string = "babad";
		System.out.println("The longest palindrome of "+string+" is "+longestPalindrome(string));
	  int[][] matrix = {{1,2,3},
			                                     {4, 5, 6},
			                                     {7, 8, 9}
			                                     };
	  rotate(matrix);
	}

}
