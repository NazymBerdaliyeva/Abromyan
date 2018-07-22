package caseTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case2 {

	public static void main(String[] args) {
		int K = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("K = ");
			K = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		switch(K) {
		case 1:
			System.out.println("ploho");
			break;
		case 2:
			System.out.println("neudovletvoritelno");
			break;
		case 3:
			System.out.println("udovletvoritelno");
			break;
		case 4:
			System.out.println("horosho");
			break;
		case 5:
			System.out.println("otlichno");
			break;
		default:
			System.out.println("oshibka!");
			break;
		}

	}

}
