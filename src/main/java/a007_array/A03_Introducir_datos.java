package a007_array;

import java.util.Scanner;

public class A03_Introducir_datos {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		int numeros[] = new int[5];
		int valor;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese un número para la posicion " + (i + 1) + ": ");
			valor = entrada.nextInt();
			numeros[i] = valor;
		}
		System.out.print("\nLos números son: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i == 0) {
				System.out.print("[" + numeros[i] + ", ");
				
			} else if (i == numeros.length - 1) {
				System.out.print(numeros[i] + "]");
				
				
			} else {
				System.out.print(numeros[i] + ", ");
			}
			
		}
		
		
		
		entrada.close();

	}

}
