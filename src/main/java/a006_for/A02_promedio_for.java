package a006_for;

import java.util.Scanner;

public class A02_promedio_for {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		float suma = 0;
		float promedio = 0;
		
		System.out.println("\n-- Calcular promedio --");
		System.out.print("Cuantas notas desea introducir: ");
		int cant = entrada.nextInt();
		System.out.println();
		
		
		for (int i = 1; i <= cant; i++) {
			
			System.out.print("Introduzca la nota " + i + ": ");
			float nota = entrada.nextFloat();
			suma += nota;
			promedio = suma/i;
		}
		
		System.out.print("\nSu promedio es: ");
		System.out.printf("%,1.2f", promedio);

		entrada.close();

	}

}
