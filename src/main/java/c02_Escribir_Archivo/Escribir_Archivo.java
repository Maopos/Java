package c02_Escribir_Archivo;

import java.io.*;


public class Escribir_Archivo {

	public static void main(String[] args) {
		
		Escribiendo escritura_01 = new Escribiendo();
		
		escritura_01.escribir();
		escritura_01.leer();
		
	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase = "\nEscribiendo una frase de prueba con JavaIO...";
		
		try {
			FileWriter escritura = new FileWriter("src/main/java/c02_Escribir_Archivo/miArchivo.txt");
			
			// con este obj escribimos sobre un archivo ya creado
			// FileWriter escritura = new FileWriter("src/main/java/c02_Escribir_Archivo/miArchivo.txt", true); 
			
			 for (int i = 0; i < frase.length(); i++) {
				 escritura.write(frase.charAt(i));
			 }
			 escritura.close();
			 System.out.println("Se escribio el archivo...");
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e);
		}
		
	}
	
	public void leer() {
		
		try {
			FileReader entrada = new FileReader("src/main/java/c02_Escribir_Archivo/miArchivo.txt");
			
			int c = entrada.read();
			
			while(c != -1) {
				char letra = (char)c;
				System.out.print(letra);
				c = entrada.read();
			}
			entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo...");
		}
	
	
}
	
}