package booleanTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolean2 {

	public static void main(String[] args) {
		int A = 0;
		boolean chetniy = false;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("A = ");
			A = Integer.parseInt(is.readLine());
			} catch(NumberFormatException ex) {		
				System.out.println("Not a number! ");
			} catch(IOException e) {
				e.printStackTrace();
			}
			if(A % 2 == 1)
				chetniy = true;
			System.out.println("Chislo A yavlyaetsya nechetnym : " + chetniy);
	}

}
