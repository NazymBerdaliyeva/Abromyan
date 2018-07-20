package ifTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class If4 {

	public static void main(String[] args) {
		int A=0, B=0, C=0;
		int countOfPoztveNumber = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("A = ");
			A = Integer.parseInt(is.readLine());
			System.out.print("B = ");
			B = Integer.parseInt(is.readLine());
			System.out.print("C = ");
			C = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(A > 0 && B > 0 && C > 0) {
			countOfPoztveNumber = 3;
		} else if((A > 0 && B > 0 && (C < 0 || C == 0)) || (A > 0 && (B < 0 || B == 0) && C > 0) ||
				((A < 0 ||A == 0) && B > 0 && C > 0)) {
			countOfPoztveNumber = 2;
		} else if(A == 0 && B == 0 && C == 0) {
			countOfPoztveNumber = 0;
		} else {
			countOfPoztveNumber = 1;
		}
		System.out.println("Kolichestvo polozhitelnyh chisel : " + countOfPoztveNumber);

	
	}
}
