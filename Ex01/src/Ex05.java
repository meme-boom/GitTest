import java.util.Arrays;

public class Ex05 {

	
	public static void main(String[] args) {

		
		int[] arr = {9,6,7,3,5};
		int w=0; //최솟값 위치
		for(int i=0; i<arr.length-1; i++) {
			int min=100;
			for(int j=i; j<arr.length; j++) {
				if(min>arr[j]) {
					min=arr[j];
					w=j;
				}
			} 
			int tmp= arr[i];
			arr[i]=arr[w];
			arr[w]=tmp;
			System.out.println(Arrays.toString(arr));//회전출력
		}
		System.out.println(Arrays.toString(arr));
}
}