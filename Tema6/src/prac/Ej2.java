package prac;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Hola, bienvenido a: Acierta la contraseña, por favor introduzca un numero");
		String palabra=sc.next();
		String palabra2="Contraseña";
		boolean equal;
		equal=palabra.equals(palabra2);;;;;;;;;;;;;;
		//primero vemos la comparación de los dos
		//vemos lo de las posiciones 
		while(equal==false) {
		System.out.println("contraseña incorrecta");
		palabra=sc.next();
		equal=palabra.equals(palabra2);
		}
		
	}
	
}
