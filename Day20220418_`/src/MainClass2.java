import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file  = new File("data/data2.txt");
		FileInputStream src = new FileInputStream(file);
		Scanner sc = new Scanner(src);
		
		while(sc.hasNext()) {
			String tmp=sc.next();
			System.out.println(tmp);
		}
		
		
	}

}
