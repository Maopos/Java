package a010_format_number;

import javax.swing.JOptionPane;

public class A02_Decimales_entrada {

	public static void main(String[] args) {
		
		String num_1 = JOptionPane.showInputDialog("Número 1");
		
		double num_2 = Double.parseDouble(num_1);
		
		System.out.print("La raiz de " + num_2 + " es: ");
		
		
		// Formato 2 decimales
		System.out.printf("%1.2f", Math.sqrt(num_2));
		
		System.out.println();
		
		
		// Sin Formato
		System.out.println("\nSin formato: " + Math.sqrt(num_2));
		
		

	}

}
