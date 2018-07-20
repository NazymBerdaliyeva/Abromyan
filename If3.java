package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If3 {

	public static void main(String[] args) {
		int A = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("A = ");
			A = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(A > 0) {
			A++;
		} else if(A < 0) {
			A-=2;
		} else {
			A = 10;
		}
		System.out.println(A);
	}
}
