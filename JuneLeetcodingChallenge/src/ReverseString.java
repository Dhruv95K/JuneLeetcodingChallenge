import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array 
in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.

Example 1:
	Input: ["h","e","l","l","o"]
	Output: ["o","l","l","e","h"]
		
Example 2:	
	Input: ["H","a","n","n","a","h"]
	Output: ["h","a","n","n","a","H"]
*/		
public class ReverseString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[] st = new char[n];
		String[] input = br.readLine().split(",");
		
		for(int i = 0;i<n;i++)
			st[i] = input[i].toCharArray()[0];
		
		reverseString(st);
		
		System.out.println(st.toString());
	}

	public static void reverseString(char[] s) {
        reverseString(s,0,s.length-1);
    }
    
    public static void reverseString(char[] s,int st,int end){
        if(st>=end)
            return;
        char t = s[st];
        s[st] = s[end];
        s[end] = t;
        reverseString(s,st+1,end-1);

    }
}
