/*
Given an input string, reverse the string word by word. Example: Input: “The sky is
blue”, output: “blue is sky the”.
1. A word is defined as a sequence of non-space characters.
2. Input string may contain leading or trailing spaces. However, your reversed string
should not contain leading or trailing spaces.
3.You need to reduce multiple spaces between two words to a single space in the reversed
string.
*/

package reverseString;

import java.util.regex.Pattern;

public class ReverseString {
		
	public static String reverse(String s) {
		//Specifying the pattern to be searched
	  Pattern pattern = Pattern.compile("\\s");
	 //Spliting String s when there is a whitespace and store in temp array
	  String[] temp = pattern.split(s);
	  String result = "";
	  for(int i = 0; i < temp.length; i++) {
		  if(i == temp.length - 1) {
			  result = temp[i] + result;
		  }
		  else {
			  result = " " + temp[i] + result;
	  }
	}
	return result;
	}
	public static void main(String[] args) {
   String word = "The sky is blue";
   System.out.println(word);
   System.out.println("The word reversed: "+ reverse(word));

	}

}





