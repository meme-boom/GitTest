import java.util.Scanner;

public class Bus03 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է����ּ���");
		int a=sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ���");
		int b=sc.nextInt();
		System.out.println("����° ������ �Է����ּ���");
		int c=sc.nextInt();
		System.out.println("�׹�° ������ �Է����ּ���");
		int d=sc.nextInt();
		System.out.println("�ټ���° ������ �Է����ּ���");
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
		
		System.out.println("����ū��: "+tmp);
		
}
}