package booleanTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolean37 {

	public static void main(String[] args) {
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		boolean istina = false;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("x1 = ");
			x1 = Integer.parseInt(is.readLine());
			System.out.print("y1 = ");
			y1 = Integer.parseInt(is.readLine());
			System.out.print("x2 = ");
			x2 = Integer.parseInt(is.readLine());
			System.out.print("y2 = ");
			y2 = Integer.parseInt(is.readLine());
		} catch(NumberFormatException e) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if((y1 <= 4 && y2 > 4 && y2 == y1 + 1) || (y1 > 4 && y2 < 5 && y2 == y1 - 1))
			istina = true;
		System.out.println("Korol' za odin hod mojet pereity s odnogo polya na drugoe : " + istina);
	}

}
