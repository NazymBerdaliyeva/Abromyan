package caseTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case1 {

	public static void main(String[] args) {
		int day = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Vvedite chislo v diapazone 1-7 : ");
			day = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		switch(day) {
		case 1:
			System.out.println("Ponedelnik");
			break;
		case 2:
			System.out.println("Vtornik");
			break;
		case 3:
			System.out.println("Sreda");
			break;
		case 4:
			System.out.println("Chetverk");
			break;
		case 5:
			System.out.println("Pyatnica");
			break;
		case 6: 
			System.out.println("Subbota");
			break;
		case 7:
			System.out.println("Voskresenie");
			break;
		default:
			System.out.println("Error!");
			break;
		}
	}

}
