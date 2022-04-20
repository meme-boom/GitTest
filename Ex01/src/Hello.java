import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		int sum=0;
		int c=0;
		boolean a = true;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		while(true){
			System.out.println("숫자입력");
			int tmp = scanner.nextInt();
			System.out.println("사칙입력(종료:x)");
			int tmp2 = scanner2.nextInt();
			
			switch(c) {
			case 1: 
			sum=sum+tmp;
			break;
			case 2:
			sum=sum-tmp;
			System.out.println(sum);
			break;
			case 3:
			sum=sum*tmp;
			System.out.println(sum);
			break;
			case 4: 
			sum=sum/tmp;
			System.out.println(sum);
			break;
			case 5:
			System.out.println("종료되었습니다");
				break;
			}
			c=sum;
			System.out.println(c);
			
		}
		
		
		
}
			
			
}