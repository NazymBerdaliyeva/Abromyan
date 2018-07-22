package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If11 {

	public static void main(String[] args) {
		int A = 0, B = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("A = ");
			A = Integer.parseInt(is.readLine());
			System.out.print("B = ");
			B = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(A != B) {
			if(A > B) {
				B =A;
			} else {
				A = B;
			}
		} else {
			A = 0;
			B = 0;
		}
		System.out.println("A = " + A + "     B = " + B);
	}

}
