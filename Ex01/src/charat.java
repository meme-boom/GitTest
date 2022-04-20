import java.util.Arrays;
import java.util.Scanner;

public class charat {

	
	public static void main(String[] args) {

		String src = "ABCDE";
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println(ch);
		}
		char[] arr=src.toCharArray();
		System.out.println(arr);
		
}
}