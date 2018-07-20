package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If2 {

	public static void main(String[] args) {
		int B = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("B = ");
			B = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(B > 0) {
			B++;
		} else {
			B-=2;
		}
		System.out.println(B);

	}

}
