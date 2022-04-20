import java.util.Arrays;

public class whatisuck {

	
	public static void main(String[] args) {

	
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer.length-i-1; j++) {
				if(answer[j]>=answer[j+1]) {
					int temp= answer[j];
					answer[j]=answer[j+1];
					answer[j+1]=temp;	
				}
				else
					continue;
			}
		}
		System.out.println(Arrays.toString(answer));
		
			
	
		
		
}
}