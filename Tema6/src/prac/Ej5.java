package prac;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*creamos el array que guardara las letras y irá aumentando cada vez que aumentas en 1 el numero de letras
		es decir, cuando escribimos una palabra, el contador aumenta al numero de letras que tiene la palabra*/
		Scanner sc= new Scanner(System.in);
		String frase="",palabra;
		
		System.out.println("Introduzca una palabra");
		palabra=sc.next();
		
		while(!palabra.equalsIgnoreCase("word")) {
		//va acumulando las palabras escritas en su valor
		frase+= palabra+" ";
		//print de la frase
		System.out.println(frase);
		//
		palabra=sc.next();
		}
		//cada vez que escribimos letra por letra, se va guardando en otr sitio
		//se hace a partir de la lectura de lo escrito
		
		//sysout de guardado en cierta posicion mas el espacio
		
		
		
		//creamos un while que va aumentando un array segun el numero de letras que introducimos
		
		
		//luego hacemos print de eso
		
	}

}
