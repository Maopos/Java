package a001_intro;

public class A08_Operadores_Logicos {

	public static void main(String[] args) {
		
		System.out.println("1: " + !true); 				// Negacion
		
		System.out.println("2: " + (true | false)); 	// OR true si uno es verdadero
		
		System.out.println("3: " + (true ^ true)); 		// XOR true si solo uno es verdadero
		
		System.out.println("4: " + (true & false)); 	// AND true si ambos son verdaderos
		
		System.out.println("5: " + (false || true)); 	// OR si el primero es true no necesita el otro
		
		System.out.println("5: " + (true && true)); 	// OR si el primero es false no necesita el otro						//

	}

}
