package a005_while_do_while;

import java.util.Scanner;

public class A05_while_menu {

	public static void main(String[] args) {
		
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("-- Menú --");
		System.out.println("Opción 1.");
		System.out.println("Opción 2.");
		System.out.println("Opción 3.");
		System.out.print("\nIngrese una opción: ");
		opcion = entrada.nextInt();
		
		
		while (opcion < 1 || opcion > 3) {
			
			System.out.println("\n-- Menú --");
			System.out.println("Opción 1.");
			System.out.println("Opción 2.");
			System.out.println("Opción 3.");
			System.out.print("\nError: ingrese la opción nuevamente: ");
			opcion = entrada.nextInt();
			
			
		}
		
		System.out.println("\nSe ingresó la opción: " + opcion);
		
		entrada.close();

	}

}
