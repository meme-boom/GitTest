public class mpney {

	
	public static void main(String[] args) {

	
		int[] coinUnit = {500,100,50,10};
		int money =2680;
		System.out.println("money: "+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			int count=0;
			while(true) {
				if(money>=coinUnit[i]) {
					money-=coinUnit[i];
					count++;
					continue;
				}
				else
					System.out.print("필요한 "+coinUnit[i]+"원의 갯수는?  ");
					break;
			}
			System.out.println(count+"개");
		}
		
		
}
}