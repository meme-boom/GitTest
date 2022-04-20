

public class p1 {

	
	public static void main(String[] args) {

		int[][] arr = {
				{5,5,5,5,5,},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30,30,30,30,30}
		};
		
		int total=0;
		float avg=0f;
		int j=0;
		for(int[] tmp : arr) {
			for(int i : tmp) {
				total+=i; j++;
			}
		}
		avg=(float)total/j;
		System.out.println(j);
		System.out.println(total);	
		System.out.println(avg);	
}
}