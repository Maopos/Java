package a003_datos_por_consola;

import javax.swing.JOptionPane;

public class A03_InputDialog {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		String edad = JOptionPane.showInputDialog("En que año naciste:"); // Devuelve String
		
		
		int año = Integer.parseInt(edad); // Convierte edad: String -> Int
		
		
		System.out.println("Hola " + nombre + " tienes " + (2021 - año) + " años.");
		

	}

}
