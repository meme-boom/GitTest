import java.util.Scanner;

public class Bus03 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요");
		int a=sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요");
		int b=sc.nextInt();
		System.out.println("세번째 정수를 입력해주세요");
		int c=sc.nextInt();
		System.out.println("네번째 정수를 입력해주세요");
		int d=sc.nextInt();
		System.out.println("다섯번째 정수를 입력해주세요");
		int e=sc.nextInt();
		
		int tmp=0;
		
		if(a>=b && a>=c && a>=d && a>=e)
			tmp=a;
		else if(b>=a && b>=c && b>=d && b>=e)
			tmp=b;
		else if(c>=a && c>=b && c>=d && c>=e)
			tmp=c;
		else if(d>=a && d>=b && d>=c && d>=e)
			tmp=d;
		else if(e>=a && e>=b && e>=c && e>=d)
			tmp=e;
		
		System.out.println("가장큰수: "+tmp);
		
}
}