package a003_datos_por_consola;

import java.util.Scanner;

public class A02_Entrada_ejemplo_1 {

	public static void main(String[] args) {
		

		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.print("Cual es tu nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("En que año naciste: ");
		int edad = entrada.nextInt();
		entrada.nextLine();
		
		
		System.out.print("Cual es tu apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println("\nBienvenido " + nombre + " " + apellido 
				+ ", tienes " + (2021 - edad) + " Años.");
		
		
		
		entrada.close();

	}

}
