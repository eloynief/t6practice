package prac;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String frase;
		String traduccion;
		String[] palabras;
		System.out.println("introduzca una palabra");
		
		frase=sc.nextLine();
		//si comienza por "Javalín, javalón",
		if (frase.startsWith("Javalín, javalón")||frase.endsWith("javalén, len, len")||frase.startsWith("Javalín, javalón")&&frase.endsWith("javalén, len, len")) {
			frase=frase.replace("Javalín, javalón", "");
			frase=frase.replace("javalén, len, len", "");
			System.out.println(frase.trim());
			
		}
	}

}
