package prac;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String frase;
		String traduccion;
		int longitud = 0;
		String guardada;
		System.out.println("introduzca una palabra");
		char[] letras= {};
		frase=sc.nextLine();
		//leer valores 
		longitud =frase.length();
		
		//guardamos cada char
		letras = frase.toCharArray();
		
		//si ese char es el mismo que el char del valor en la tabla, se sustituye
		//un bucle para leer los valores de lo que has escrito
		//otro bucle para ver si 
		
		//codifica([i],[j],char[])
		//si es igual, se sustituye el valor por el del conjunto 2
		
		
		//luego se pasa a un string con todo substituido
		
	}
	//el 
	char codifica(char conjunto1[],char conjunto2[], char c) {
		//
		char[] conjuntoa={"e","i","k","m","p","q","r","s","t","u","v"};
		char[] conjuntob={"p"+"v"+"i"+"u"+"m"+"t"+"e"+"r"+"k"+"q"+"s"};
		
	}

}
//paso1: valor
//paso 2, leer valores y ver si en ese valor de array es el mismo que seria ese otro
//