package c06_Manejo_Archivos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class A03_Crear_Archivo {
	public static void main(String[] args) {
		File destino_archivo = new File("src/main/java/c06_Manejo_Archivos/nuevo_archivo1.txt"); 
		String ruta = destino_archivo.getAbsolutePath();
		try {
			destino_archivo.createNewFile();
		} catch (IOException e) {
			System.out.println(e);}
		Escribiendo acceso = new Escribiendo();
		acceso.escribir(ruta);
	}}
class Escribiendo{
	public void escribir(String ruta) {
		String frase = "\nHola mundillo..., escribiendo frase en un archivo...😁😂";
		try {
			FileWriter escritura = new FileWriter(ruta);
			for (int i = 0; i < frase.length(); i++) {
				 escritura.write(frase.charAt(i));}
			 escritura.close();
		} catch (IOException e) {
			System.out.println(e);
		}}}