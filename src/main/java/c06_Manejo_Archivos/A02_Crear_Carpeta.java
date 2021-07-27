package c06_Manejo_Archivos;

import java.io.File;

public class A02_Crear_Carpeta {

	public static void main(String[] args) {
		
		File destino_carpeta = new File("src/main/java/c06_Manejo_Archivos/Nueva_Carpeta.java"); // se guarda la ruta 
		
		destino_carpeta.mkdir();																// se crea un directorio - carpeta

	}

}
