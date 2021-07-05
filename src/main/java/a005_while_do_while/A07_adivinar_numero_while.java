package a005_while_do_while;

import java.util.Scanner;

public class A07_adivinar_numero_while {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		int numero = (int)(Math.random()*100);
		
//		System.out.println(numero); // Muestra el número secreto...
		
		int numero_usuario = 0;
		
		System.out.println("\n-- Adivina el número secreto... --");
		System.out.print("Cuantas oportunidades necesitas: ");
		
		int intentos = entrada.nextInt();
		System.out.println();
		int oportunidades = 0;
		
		
		while (numero_usuario != numero) {
			
			intentos --;
			oportunidades ++;
			
			System.out.print("Introduce un Número entre 1 y 100: ");
			numero_usuario = entrada.nextInt();
			
			if (intentos > 0) {
				
				if (numero < numero_usuario) {
					
					System.out.println("Debe ser menor a " + numero_usuario);
					
					
				} else if (numero > numero_usuario) {
					
					System.out.println("Debe ser mayor a " + numero_usuario);
					
				} 
				
			} else if (intentos == 0) {
				
				break;
			}
			
		}
		
		if (numero_usuario == numero) {
			
			System.out.println("\nAdivinaste en " + oportunidades + " intentos!!, el número es el: " + numero);
			
		} else {
			System.out.println("\nPerdiste... el número era el " + numero);
							
		}
		
		entrada.close();

	}

}
