package a009_clase_String;

public class A01_Metodos_String {

	public static void main(String[] args) {
		
		String nombre_2 = "mauricio posada";
		
		// lenght(): longitud cadena String
		String nombre = "Mauricio Posada";
		System.out.println("Mi nombre es: " + nombre);
		
		
		int longitud = nombre.length();
		System.out.println("Mi nombre tiene " + longitud + " caracteres.");
		
		
		//charAt(n): devuelve la posicion de un caracter en un String
		char posicion = nombre.charAt(9);
		System.out.println("La letra número 9 es " + posicion);
		
		
		
		// substring(x, y): devuelve subcadena desde x hasta y posiciones
		String apellido = nombre.substring(9, 15);
		System.out.println("Mi apellido es " + apellido);
		
		
		
		// equals(cadena): true si son dos cadena iguales
		boolean comparacion = nombre.equals(nombre_2);
		System.out.println(comparacion);
		
		
		
		//equalsIgnoreCase(nombre): true si son cadenas iguales ignora lower and upper cases
		comparacion = nombre.equalsIgnoreCase(nombre_2);
		System.out.println(comparacion);
		
		
	}

}
