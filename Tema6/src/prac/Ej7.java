package prac;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String palabra,frase;
		int veces=0;
		String[] palabras;
		System.out.println("introduzca una palabra");
		
		palabra=sc.next();
		//si la mitad hacia arriba de esa parte de string array es igual que la otra mitad de abajo,entonces
		
//		se guardan las palabras en el string palabras
		palabras=palabra.split(" ");
		//for donde i se iguala a palabras.length y disminuye hasta llegar a la mitad del palabras.length
		//si en ese for i string es igual que otra variable que va sumando desde 0
		for(int i=palabras.length;i>palabras.length/2;i--) {
			
		}
	}

}
