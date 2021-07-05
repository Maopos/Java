package a002_condicionales;

import java.util.Scanner;

public class A05_Ejercicio_if {

	public static void main(String[] args) {
		
		
		Scanner entrada;
		
		entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = entrada.nextInt();
		
		
		
		if (edad < 18) {
			
			System.out.println("\nEres un adolescente.");
			
		} else if (edad < 40){
			
			System.out.println("\nEres Joven.");
			
		} else if (edad < 65) {
			
			System.out.println("\nEres maduro.");
			
		} else {
			
			System.out.println("\nCuidate.");
			
		}
		
		
		entrada.close();
	}

}
