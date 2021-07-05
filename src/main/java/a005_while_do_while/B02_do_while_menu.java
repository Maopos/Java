package a005_while_do_while;

import java.util.Scanner;

public class B02_do_while_menu {

	public static void main(String[] args) {
		
		boolean error = false;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("-- Menú --");
			System.out.println("1. Opción");
			System.out.println("2. Opción");
			System.out.println("3. Opción\n");
			System.out.print("Ingrese una opción: ");
			
			int opcion = entrada.nextInt();
			
			if ((opcion < 1) || (opcion > 3)) {
				System.out.println("Error: La opción es incorrecta.");
				error = true;
			} else {
				System.out.println("Se ingresó la opción " + opcion);
				error = false;
			}
			
		} while (error == true);
		
		
		
		
		entrada.close();

	}

}
