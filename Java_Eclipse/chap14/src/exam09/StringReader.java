package exam09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {
	public static void main(String[] args) {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("String.txt"));
			String str = "";
			
			while(true) {
				str = in.readLine();
				if(str == null) { break; }
				
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
