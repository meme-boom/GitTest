import java.util.Scanner;

public class Bus8 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		System.out.println();
		System.out.println(">>>>>>>>"+year+"년 "+month+"월"+"<<<<<<<<");
		System.out.println(" 일  월  화  수 목  금  토");
		System.out.println("========================");
		int days= (year-1)*365+((int)(year-1)/4);
		int day= ((year-1)*365+((int)(year-1)/4))%7;
		int i=0; int j=1;
		
		
		if(month==1) {
			for(; i<day; i++) {
				System.out.print("   ");
			}
			for(; j<=31; j++) {
				System.out.printf("%3d",j);
				if((i+j)%7==0) {
					System.out.println();
					
				}
					
			}
		}
		if(month==2) {
			for(; i<)
		}
		
		
		
}
}