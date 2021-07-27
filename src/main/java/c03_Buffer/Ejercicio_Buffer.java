package c03_Buffer;

import java.io.*;

public class Ejercicio_Buffer {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader frase = new BufferedReader(isr);
		
		try {
			
			System.out.print("Escribe tu nombre: ");
			String nombre = frase.readLine();
			System.out.print("Escribe tu curso: ");
			String curso = frase.readLine();
			System.out.print("Escribe tu ciudad: ");
			String ciudad = frase.readLine();
			
			System.out.println("Hola, " + nombre + " Bienvenido a tu curso de " + curso + " en la ciudad de " + ciudad + ".");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
