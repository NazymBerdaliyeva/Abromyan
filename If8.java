package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If8 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a = ");
			a = Integer.parseInt(is.readLine());
			System.out.print("b = ");
			b = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(a > b) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + " " + a);
		}
	}
}
