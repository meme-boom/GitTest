import java.util.Arrays;

public class Bus16 {

	
	public static void main(String[] args) {

	
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		float avg =sum/100.0f;
		System.out.printf("%.1f",avg);
		System.out.println();
	///////////////////////////////////////////////////////////	
		int count=0;
		int summ=0;
		int[] arr = new int[count];
	
		for(int i=1; i<=100; i++) {
			if(i%2==0 && i%7==0) {
				summ+=i;
				count++;
			}
			else
				continue;
		}
		System.out.println(count);
		System.out.println(summ);
		System.out.println(Arrays.toString(arr));
}
}