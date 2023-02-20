package prac;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("s");
		String palabra=sc.next();
		String palabra2=sc.next();
		int longitud=0,longitud2=0;
		longitud = palabra.length(); 
		longitud2 = palabra2.length(); 
		if(longitud<longitud2) {
			System.out.println(palabra2+" tiene mas caracteres que "+palabra);
		}
		else if(longitud==longitud2){
			System.out.println(palabra+" y "+palabra2+"tienen los mismos caracteres");
		}
		else {
			System.out.println(palabra+" tiene menos caracteres que "+palabra2);
		}
		
		
	}

}
