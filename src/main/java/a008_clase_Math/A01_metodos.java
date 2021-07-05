package a008_clase_Math;

public class A01_metodos {

	public static void main(String[] args) {
		
		int numero = 540;
		
		double raiz = Math.sqrt(numero); // Devuelve un double
		System.out.println("Raiz cuadrada de: " + numero + " es: " 
		+ raiz);
		
		
		int redondeado = (int)Math.round(raiz); // Devuelve un long
		System.out.println("Redondeado es: " + redondeado);
		
		
		double potencia = Math.pow(redondeado, 3); // Devuelve un double
		System.out.println(redondeado + " elevado a la 3, es igual a: " + potencia);
		 
	}

}
