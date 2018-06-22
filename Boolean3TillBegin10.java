package booleanTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolean3TillBegin10 {

	public static void main(String[] args) {
		int A = 0;
		boolean chetniy = false;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("A = ");
			A = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number! ");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(A % 2 == 0)
			chetniy = true;
		System.out.println("Chislo A yavlyaetsya chetnym : " + chetniy);
		
				//boolean 4
				/*int A = 0, B = 0;
				boolean da = false;
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("A = ");
					A = Integer.parseInt(is.readLine());
					System.out.print("B = ");
					B = Integer.parseInt(is.readLine());
				} catch(NumberFormatException ex) {
					System.out.println("Not a number! ");
				} catch(IOException e) {
					e.printStackTrace();
				}
				if(A > 2 && B <= 3)
					da = true;
				System.out.println(A + " > 2 && " + B + " <= 3 : " + da);*/
				
				//boolean 5
				/*int A = 0 , B = 0;
				boolean pravilno = false;
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("A = ");
					A = Integer.parseInt(is.readLine());
					System.out.print("B = ");
					B = Integer.parseInt(is.readLine());
				} catch(NumberFormatException ex) {
					System.out.println("Not a number!");
				} catch(IOException e) {
					e.printStackTrace();
				}
				if(A >= 0 || B < -2)
					pravilno = true;
				System.out.println(A + " >= 0 || " + B + "< -2 : " + pravilno);*/
				
				//BOOLEAN 6
				/*int A = 0, B = 0, C = 0;
				boolean istina = false;
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
				if(A < B && B < C)
					istina = true;
				System.out.println(A + " < " + B + "< " + C + " : " + istina);*/
				
				//boolean 7
				/*int A = 0, B = 0, C = 0;
				boolean istina = false;
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
				if(A < B && B < C)
					istina = true;
				System.out.println("Chislo " + B + " nahoditsya mejdu chislamy " + A + " & " + C + " : " + istina);*/
				
				//boolean 8
				/*int A = 0 , B = 0;
				boolean pravilno = false;
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("A = ");
					A = Integer.parseInt(is.readLine());
					System.out.print("B = ");
					B = Integer.parseInt(is.readLine());
				} catch(NumberFormatException ex) {
					System.out.println("Not a number!");
				} catch(IOException e) {
					e.printStackTrace();
				}
				if(A%2 == 1 && B%2 == 1)
					pravilno = true;
				System.out.println("Kajdoe iz chisel " + A + " & " + B + " nechetnoe : " + pravilno);*/
				
				//boolean 9
				/*int A = 0 , B = 0;
				boolean pravilno = false;
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("A = ");
					A = Integer.parseInt(is.readLine());
					System.out.print("B = ");
					B = Integer.parseInt(is.readLine());
				} catch(NumberFormatException ex) {
					System.out.println("Not a number!");
				} catch(IOException e) {
					e.printStackTrace();
				}
				if(A%2 == 1 || B%2 == 1)
					pravilno = true;
				System.out.println("Hotya by odno iz chisel " + A + " & " + B + " nechetnoe : " + pravilno);*/
				
				//boolean10
				/*int A = 0 , B = 0;
				boolean pravilno = false;
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("A = ");
					A = Integer.parseInt(is.readLine());
					System.out.print("B = ");
					B = Integer.parseInt(is.readLine());
				} catch(NumberFormatException ex) {
					System.out.println("Not a number!");
				} catch(IOException e) {
					e.printStackTrace();
				}
				if((A%2 == 1 && B%2 == 0) || (A%2 == 0 && B%2 == 1))
					pravilno = true;
				System.out.println("Rovno odno iz chisel " + A + " & " + B + " nechetnoe : " + pravilno);*/
				

	}

}
