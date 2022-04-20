import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int x=10;
		if(x>10 && x<20)
			System.out.println(true);
		else
			System.out.println(false);
		
		char ch1='^';
		if(ch1==0)
			System.out.println(false);
		else
			System.out.println(true);
			
		char ch2='X';
		if(ch2=='x' || ch2=='X')
			System.out.println(true);
		else
			System.out.println(false);
		
		char ch3='1';
		if(ch3>='0' && ch3<='9')
			System.out.println(true);
		else
			System.out.println(false);
			
		char ch4='1';
		if((ch4>='a' && ch4<='z') || (ch4>='A' && ch4<='Z'))
			System.out.println(true);
		else
			System.out.println(false);
		
		int year = 400;
		if((year%400==0 || year%4==0) && year%100!=0)
			
		
		
		
	}
	
}
