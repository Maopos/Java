package c04_Bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Leer_Escribir_Bytes {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream archivo_lectura = new FileInputStream("src/main/java/c04_Bytes/pencilcase.png");
			
			
			byte[] contenido = archivo_lectura.readAllBytes();
			
				
			System.out.print(contenido.length);
			
			
			crear_archivo(contenido);
			archivo_lectura.close();
			
		} catch (IOException e) {
			
			System.out.println(e);
		}
		

	}
	
	static void crear_archivo(byte[] contenido) {
		
		try {
			
			FileOutputStream nuevo_archivo = new FileOutputStream("src/main/java/c04_Bytes/pencilcase_copia.png");
			
			for (byte i: contenido) {
				
				nuevo_archivo.write(i);
				
			}
			
			nuevo_archivo.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
