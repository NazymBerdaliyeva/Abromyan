package learinngJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbromyanBegin {

	public static void main(String[] args) throws IOException {
		
		/*
		11.03.18
		
		Begin 1 
		
		String input = null;
		int a = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Vvedite chislo a = ");
			input = is.readLine();
	        a = Integer.parseInt(input);
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		P = 4 * a;
		System.out.println("Perimetr kvadrata raven: " + P);
		System.out.println(a);
		 */
		//Begin 2
		/*String input = null;
		int a = 0;
		int S;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Storona kvadrata a = ");
			input = is.readLine();
			a = Integer.parseInt(input);
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		S = a * a;
		System.out.println("S = " + S);
			*/
		//Begin 3
		/*float a = 0, b = 0, S, P;
		String input = null;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a = ");
			input = is.readLine();
			a = Integer.parseInt(input);
			System.out.print("b = ");
			input = is.readLine();
			b = Integer.parseInt(input);
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		S = a * b;
		P = 2 * (a + b);
		System.out.println("S = " + S + "\n" + "P = " + P);
		*/
		//Begin 4
		/* float d = 0;
		double L;
		float Pi = (float) 3.14;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("d = ");
			d = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		L = d * Pi;
		System.out.println("L = " + L);
		*/
		
		//Begin 5
		/*float a = 0;
		float S, V;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a = ");
			a = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		V = (float) Math.pow(a, 3.0);
		S = (float) (6 * Math.pow(a, 2));
		System.out.println("V = " + V + "\n" + "S = " + S);
		*/
		
		//Begin 6
		/*float a = 0, b = 0, c = 0;
		float V, S;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a = ");
			a = Integer.parseInt(is.readLine());
			System.out.print("b = ");
			b = Integer.parseInt(is.readLine());
			System.out.print("c = ");
			c = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		V = a * b * c;
		S = (a *b + b*c + a*c);
		System.out.println("V = " + V + "\n" + "S = " + S);
		*/
		//Begin 7
		/*float Pi = (float) 3.14;
		float R = 0;
		float L, S;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("R = ");
			R = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch(IOException e) {
			e.printStackTrace();
		}
		L = 2 * Pi * R;
		S = (float) (Pi * Math.pow(R, 2));
		System.out.println("L = " + L + "\n" + "S = " + S);
		
	}*/
	
	// Begin 8
	/*float a = 0, b = 0;
	float avrgSum;
	try {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a = ");;
		a = Integer.parseInt(is.readLine());
		System.out.print("b = ");;
		b = Integer.parseInt(is.readLine());
	} catch(NumberFormatException ex) {
		System.out.println("Not a number!");
	} catch(IOException e) {
		e.printStackTrace();
	}
	avrgSum = (a + b) / 2;
	System.out.println("Average is: " + avrgSum);
	}
}*/
		//begin 9
		/* float a = 0, b = 0;
		float geomAvrg;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a = ");
			a= Integer.parseInt(is.readLine());
			System.out.print("b = ");
			b = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		geomAvrg = (float) Math.sqrt(a * b);
		System.out.println("Geometrical average is: " + geomAvrg);
	}
} */
		//begin 10
	/*	float a = 0, b = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a=");
			a = Integer.parseInt(is.readLine());
			System.out.print("b=");
			b= Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(" Сумма квадратов: " + (Math.pow(a, 2) + Math.pow(b, 2)));
		System.out.println("Разность квадратов: " + (Math.pow(a, 2) - Math.pow(b, 2)));
		System.out.println("Произведение квадратов: " + Math.pow(a, 2) * Math.pow(b, 2));
		System.out.println("Частность квадратов: " + Math.pow(a, 2)/Math.pow(b, 2));
	}
}*/
		//begin 11
		/*float a = 0, b = 0;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a=");
			a = Integer.parseInt(is.readLine());
			System.out.print("b=");
			b= Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(" Сумма модулей: " + (Math.abs(a) + Math.abs(b)));
		System.out.println("Разность модулей: " + (Math.abs(a) - Math.abs(b)));
		System.out.println("Произведение модулей: " + Math.abs(a) * Math.abs(b));
		System.out.println("Частность модулей: " + Math.abs(a)/Math.abs(b));
	}
}*/

	//begin 12
		/*float a = 0, b = 0;
		float c = 0, P;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("a=");
			a = Integer.parseInt(is.readLine());
			System.out.print("b=");
			b= Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		c = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("c = " + c);
		System.out.println("P = " + (a + b + c));
	}
}*/
		//begin 13
		/*float R1 = 0, R2 = 0, S1 = 0, S2 = 0; 
		float S3;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("R1 = ");
			R1 = Integer.parseInt(is.readLine());
			System.out.println("R2 = ");
			R2 = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		S1 = (float) Math.PI * R1 * R1;
		S2 = (float) Math.PI * R2 * R2;
		System.out.println("S1 = " + S1 + "\nS2 = " + S2 + "\n S3 = " + (S1 - S2));
	}
}*/
		//begin 14
	/*	float L = 0, R = 0, S;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("L = ");
			L = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		R = (float)(L/(2*Math.PI));
		S = (float) (Math.PI * R *R);
		System.out.println("R = " + R + "\nS = " + S);
	}
}*/
		//begin 15
		/*
		float S = 0 ,D = 0, L;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("S = ");
			S = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		D = (float)(Math.sqrt((4*S)/Math.PI));
		L = (float)(Math.PI * D);
		System.out.println("D = " + D + " \n L = " + L);
	}
}
		*/
		//begin 16
		/*float x1 = 0, x2 = 0;
		
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("x1 = ");
			x1 = Integer.parseInt(is.readLine());
			System.out.print("x2 = ");
			x2 = Integer.parseInt(is.readLine());
		} catch(NumberFormatException ex) {
			System.out.println("Not a number!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Расстояние между двумя точками : " + (Math.abs(x2 - x1)));
		
	}
}*/
		//begin 17
        /*float x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        float AC, BC;
        try {
        		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        		System.out.print(" Координаты точки А(x1 = ");
        		x1 = Integer.parseInt(is.readLine());
        		System.out.print("y1 = ");
        		y1 = Integer.parseInt(is.readLine());
        		System.out.print(" Координаты точки B(x2 = ");
        		x2 = Integer.parseInt(is.readLine());
        		System.out.print("y2 = ");
        		y2 = Integer.parseInt(is.readLine());
        		System.out.print(" Координаты точки C(x3 = ");
        		x3 = Integer.parseInt(is.readLine());
        		System.out.print("y3 = ");
        		y3 = Integer.parseInt(is.readLine());
        } catch(NumberFormatException ex) {
        	System.out.println("Not a number!");
        } catch(IOException e) {
        	e.printStackTrace();
        }
        AC = (float)(Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2)));
        BC = (float)(Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2)));
        System.out.println("AC = " + AC);
        System.out.println("BC = " + BC);
        System.out.println("Сумма отрезков АС и ВС равен:" + (AC+BC));
	}
}*/

