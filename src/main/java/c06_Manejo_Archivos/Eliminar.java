
package c06_Manejo_Archivos;

import java.io.File;

public class Eliminar {

	
	public static void main(String[] args) {
		
		File destino_archivo = new File("src/main/java/c06_Manejo_Archivos/Nueva_Carpeta.java/nuevo_archivo1.txt"); 
		
		destino_archivo.delete();

	}

}
