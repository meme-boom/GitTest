public class Bus15 {

	
	public static void main(String[] args) {
		
		int a =(int)(Math.random()*100)+1;
		int b=0;
		
		switch(a) {
		case 0 :case 1 : case 2 : case 3:
			b=100;
			break;
		case 4...13 :
			b=50;
		case 
			
			
		}
		if(a>=0 && a<=3)
			b=100;
		else if(a>=4 && a<=13)
			b=50;
		else if(a>=14 && a<=19)
			b=25;
		else if(a>=20 && a<=64)
			b=0;
		else if(a>=65)
			b=100;
		else
			System.out.println("0이상 값입력");
		
		
		int price=1500-1500*(b)/100;
		System.out.println("나이 "+a);
		System.out.println("할인율 "+b+"%");
		System.out.println("가격 "+price);
}

}