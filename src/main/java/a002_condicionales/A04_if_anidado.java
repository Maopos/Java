package a002_condicionales;

import java.util.Scanner;

public class A04_if_anidado {

	public static void main(String[] args) {
		
		float num_1, num_2, num_3;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		num_1 = entrada.nextInt();
		
		System.out.print("Ingrese número 2: ");
		num_2 = entrada.nextInt();
		
		System.out.print("Ingrese número 3: ");
		num_3 = entrada.nextInt();

		float promedio = (num_1 + num_2 + num_3)/3;
		
		if (promedio >= 7) {
			System.out.println("\nPromocionado: " + promedio);
			
		} else if ((promedio >= 4) && promedio < 7) {
			System.out.println("\nRegular: " + promedio);
			
		} else {
			System.out.println("\nReprobado: " + promedio);
			
		}
		
		entrada.close();
	}

}
