package prac;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String palabra,frase;
		int veces=0;
		System.out.println("introduzca una palabra");
		String[] palabras;
		
		palabra=sc.next();
		
		System.out.println("introduzca una frase");
		//ponemos el valor de la frase
		frase=sc.next();
		//cada palabra de la frase se guarda en el string cadenas
		palabras = frase.split(" "); // Separador: espacio en blanco

		for(int i=0;i<palabras.length;i++) {
			//si la palabra es la misma que la frase
			if(palabras[i].equals(palabra)){
				veces++;
			}
			
			
		}
		//print de la frase
		System.out.println(veces);
	}

}
