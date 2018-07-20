package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If1 {

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
		} else {
			A =A;
		}
		System.out.println(A);
	}

}
