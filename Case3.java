package caseTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case3 {

	public static void main(String[] args) {
		int mesyac = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Vvedite celoe chislo v diapazone 1 - 12 :");
			mesyac = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		switch(mesyac) {
		case 1:
		case 2:
		case 12:{
			System.out.println("Zima");
			break;
		}
		case 3:
		case 4:
		case 5: {
			System.out.println("Vesna");
			break;
		}
		case 6:
		case 7:
		case 8: {
			System.out.println("Leto");
			break;
		}
		case 9:
		case 10:
		case 11: {
			System.out.println("Osen");
			break;
		}
		default:
			System.out.println("Oshibka!");
			break;
		}
	}

}
