package prac;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int longitud,longitud2;
		String cad1, cad2;
		
		System.out.println("Ekribeh algoh: ");
		
		cad1=sc.nextLine();
		
		
		System.out.println("Ekribeh algoh 2: ");
		
		cad2=sc.nextLine();
		
		
		longitud = cad1.length();
		longitud2 = cad2.length();
		
		if(longitud2>longitud) {
			System.out.println(cad2);
		}
		else if(longitud>longitud2) {
			System.out.println(cad1);
		}
		else {
			System.out.println("tu mulah toa");
		}
		
	}

}
