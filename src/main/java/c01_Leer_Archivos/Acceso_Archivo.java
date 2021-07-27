package c01_Leer_Archivos;


import java.io.FileReader;
import java.io.IOException;

public class Acceso_Archivo {

	public static void main(String[] args) {
		
		Leer_Archivo lectura = new Leer_Archivo();
		
		lectura.leer();
				

	}

}

class Leer_Archivo{  // Video 152 curso java pildoras informaticas
	
	public void leer() {
		
		try {
			FileReader entrada = new FileReader("src/main/java/c01_Leer_Archivos/archivo.txt");
			
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