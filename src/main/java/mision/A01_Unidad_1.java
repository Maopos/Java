package mision;



public class A01_Unidad_1 {
	public static void main(String[] args) {
		String cadena = "El perro (Canis familiaris o Canis lupus familiaris dependiendo de si se lo considera una especie por derecho"
				+ " propio o una subespecie del lobo)";
		System.out.println("Longitud de la frase: " + cadena.length()); // devuelve la longitud de la cadena
		System.out.println("Letra en posición 15: " + cadena.charAt(10)); // devuelve la posicion de un caracter
		String subFrase = cadena.substring(10, 15);
		System.out.println("Subfrase: " + subFrase); // devuelve una subcadena desde la posicion x hasta y
		System.out.println(cadena.toLowerCase()); // devuelve la cadena en minusculas
		System.out.println(cadena.toUpperCase()); // devuelve la cadena en mayusculas
		System.out.println(cadena.trim()); // elimina los espacios al principio y al final de la cadena
	}

}




// luisguillermomolero@gmail.com