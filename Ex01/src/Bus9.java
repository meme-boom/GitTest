import java.util.Arrays;
import java.util.Scanner;

public class Bus9 {

	
	public static void main(String[] args) {

		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++)
			numArr[i]=(int)(Math.random()*10);
		
		for(int i=0; i<numArr.length; i++)
			counter[numArr[i]]++;
		
		
}
}