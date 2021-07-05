package a003_datos_por_consola;

import java.util.Scanner;

public class A01_Scanner {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		
		System.out.print("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("\nHola " + nombre + ", Cual es tu edad?: ");
		int edad = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("\nDe donde eres?: ");
		String pais = entrada.nextLine();
		
		
		System.out.print("\n" + nombre + ", tu edad es " + edad + " años y eres de "
		+ pais + ".");
		
		entrada.close();
		
		

	}

}
