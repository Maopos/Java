package b005_Enumerados;

import java.util.Scanner;

public class Uso_tallas {
	
	//enum Talla {PEQUEÑA, MEDIANA, GRANDE};
	
	enum Talla {
		
		SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRALARGE("XL");
		
		private String abreviatura; 
		
		private Talla(String abreviatura) {// Los tipos enumerado no permiten instanciar objetos -> private el constructor
			
			this.abreviatura = abreviatura;
			
		}
		
		public String getTalla() {
			return abreviatura;
		}
		
	}

	public static void main(String[] args) {
		
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.print("Escribe una talla (SMALL, MEDIUM, LARGE, EXTRALARGE): ");
		String datos = entrada.nextLine().toUpperCase();
		
		
		Talla talla_usuario = Enum.valueOf(Talla.class, datos);
		
		System.out.println("Talla: " + datos + " = " + talla_usuario.getTalla());
		

		entrada.close();
		

	}

}
