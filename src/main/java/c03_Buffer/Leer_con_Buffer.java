package c03_Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Leer_con_Buffer {
	
public static void main(String[] args) {
		
		Leer_Archivo lectura = new Leer_Archivo();
		
		lectura.leer();
				

	}

}

class Leer_Archivo{  // Video 152 curso java pildoras informaticas
	
	public void leer() {
		
		try {
			FileReader entrada = new FileReader("src/main/java/c03_Buffer/archivo_grande.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = miBuffer.readLine();
			
			while(linea != null) {
				
				System.out.println(linea);
				linea = miBuffer.readLine();
				
			}
			entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo...");
		}
		
	}

}
