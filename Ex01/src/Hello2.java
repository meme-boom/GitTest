import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		
		int sum=0;
		boolean a = true;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		while(true){
			System.out.println("�����Է�");
			int tmp = scanner.nextInt();
			System.out.println("��Ģ�Է�(����:x)");
			String tmp2 = scanner2.nextLine();
			
			if(tmp2.equals("*"))
				sum=sum*tmp;
				System.out.printf("%d",sum); 
			if(tmp2.equals("-"))
				sum=sum-tmp;
				System.out.println(sum);
			if(tmp2.equals("+"))
				sum=sum+tmp;
				System.out.println(sum);
			if(tmp2.equals("/"))
				sum=sum/tmp;
				System.out.println(sum);
			if(tmp2.equals("x"))
				System.out.println("����Ǿ����ϴ�");
				break;	
		}
		
		
		
	}
		
}
			