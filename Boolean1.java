package learinngJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Boolean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int A = 0;
				boolean poloj = false;
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("A = ");
					A = Integer.parseInt(is.readLine());
				} catch(NumberFormatException ex) {
					System.out.println("Not a number!");
				} catch(IOException e) {
					e.printStackTrace();
				}
				if (A > 0)
					poloj = true;
				System.out.println("Chislo " + A + " yavlyaetsya polojitelnym : " + poloj);
	}

}
