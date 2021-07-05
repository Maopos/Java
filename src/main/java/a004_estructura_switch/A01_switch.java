package a004_estructura_switch;

import java.util.Scanner;

public class A01_switch {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		int numero = entrada.nextInt();
		
		switch(numero) {
		case 1: 
			System.out.println("Número 1");
			break;
			
		case 2:
			System.out.println("Número 2");
			break;
			
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Número entre 3 y 6");
			break;
			
		default:
			System.out.println("Número no cumple niguna condición.");
			break;
		}
		
		entrada.close();

	}

}
