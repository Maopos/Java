package c06_Manejo_Archivos;

import java.io.File;

public class A01_Pruebas_Rutas {

	public static void main(String[] args) {
		
		File consulta = new File("src/main/java/c06_Manejo_Archivos");
		
		System.out.println(consulta.getAbsolutePath());  	// String - path del archivo
		System.out.println(consulta.exists());			 	// Boolean - si existe el archivo en la ruta especificada
		
		String[] archivos = consulta.list();				// Array de Strings - Archivos dentro de una carpeta
		
		for (String i: archivos) {
			
			System.out.println(i);
			
			File f = new File(consulta.getAbsoluteFile(), i); // Array de Strings - Archivos dentro de una Subcarpeta
			
			if (f.isDirectory()) {
				for (String j: f.list()) {
					System.out.println(j);
				}
			}

		}

	}
	
}
