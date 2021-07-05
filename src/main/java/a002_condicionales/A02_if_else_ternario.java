package a002_condicionales;

public class A02_if_else_ternario {

	public static void main(String[] args) {
		
		float sueldo = 50000;
		float impuesto;
		
		impuesto = (sueldo >= 50000) ? sueldo * (15f/100) : 0; // En una sola linea
		
		float resultado = sueldo - impuesto;
		
		System.out.println("El total a pagar es : " + resultado);
		

	}

}
