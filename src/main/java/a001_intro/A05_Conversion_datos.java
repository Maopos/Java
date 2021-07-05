package a001_intro;

public class A05_Conversion_datos {

	public static void main(String[] args) {
		
		int numero = 5;
		int numero_1 = 7;
		float numero_2 = 8.5f;
		
		int numero_3 = (int) numero_2; 				// float -> int
		
		System.out.println(numero_3); 
		
		//---------------------------------------
		
		numero_2 = numero; 							// int -> float
		
		System.out.println(numero_2);
		
		//---------------------------------------
		
		float resultado = (float)numero / numero_1; // int -> float
		
		System.out.println(resultado);
		
		//---------------------------------------
		
		String cadena = "5234";
		
		int num = Integer.parseInt(cadena);  		// String -> int
		float num_2 = Float.parseFloat(cadena);		// String -> float
		
		System.out.println(num);
		System.out.println(num_2);
		
		//---------------------------------------
		
		cadena = Integer.toString(num); 			// int -> String
		String cadena_2 = String.valueOf(num_2); 	// float -> String
		
		mostrarMensaje(cadena);
		mostrarMensaje(cadena_2);

	}
	
	public static void mostrarMensaje(String texto) {
		
		System.out.println(texto);
		
		
	}

}
