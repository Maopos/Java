package c02_Escribir_Archivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio {
	public static void main(String[] args) {
		Escritura_Archivo escritura = new Escritura_Archivo();
		escritura.escribir_frase();
		escritura.leer_archivo();
	}}
class Escritura_Archivo{
	public void escribir_frase() {
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.print("Escribe lo que deseas guardar en el archivo: ");
		String frase_a_guardar = entrada.nextLine();
		try {
			FileWriter escritura = new FileWriter("src/main/java/c02_Escribir_Archivo/escribir_leer.txt");
			 for (int i = 0; i < frase_a_guardar.length(); i++) {
				 escritura.write(frase_a_guardar.charAt(i));}
			 escritura.close();
			 System.out.println("Se escribio el archivo...");
		} catch (IOException e) {
			System.out.println("Error: " + e);}
		entrada.close();}
public void leer_archivo() {
		try {
			FileReader entrada = new FileReader("src/main/java/c02_Escribir_Archivo/escribir_leer.txt");
			int c = entrada.read();
			while(c != -1) {
				char letra = (char)c;
				System.out.print(letra);
				c = entrada.read();}
			entrada.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo...");
		}}}
	
