package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If9 {

	public static void main(String[] args) {
		float A = 0, B = 0, temp;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("A = ");
			A = Float.parseFloat(is.readLine());
			System.out.print("B = ");
			B = Float.parseFloat(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(A > B) {
			temp = A;
			A = B;
			B = temp;
		} 
		System.out.println(A + " " + B);

	}

}
