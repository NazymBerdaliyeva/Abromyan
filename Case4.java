package caseTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case4 {

	public static void main(String[] args) {
		int mesyac = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Vvedite cifry v diapazone 1 - 12 : ");
			mesyac = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
			switch(mesyac) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10: 
				case 12:{
					System.out.println("31 dney");
					break;
				}
				case 2:
					System.out.println("28 dney");
					break;
				case 4:
				case 6:
				case 9:
				case 11:{
					System.out.println("30 dney");
					break;
				}
				default:
					System.out.println("Oshibla!");
					break;
		}
	}

}
