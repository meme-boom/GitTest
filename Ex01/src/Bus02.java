public class Bus02 {

	
	public static void main(String[] args) {
		
		int age =(int)(Math.random()*100)+1;

		int rate=dc(age);
		int price=2500-2500*(rate)/100;
			
		System.out.println("나이 : "+age);
		System.out.println("할인율 : "+rate+"%");
		System.out.println("가격 : "+price);

		}
	
	
	public static int dc(int a) {
		int b=0;
		if(a>=0 && a<=3)
			b=100;
		if(a>=4 && a<=13)
			b=50;
		if(a>=14 && a<=19)
			b=25;
		if(a>=20 && a<=64)
			b=0;
		if(a>=65)
			b=100;
		return b;			
	}
}
