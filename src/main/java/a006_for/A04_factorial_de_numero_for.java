package a006_for;

import javax.swing.JOptionPane;



public class A04_factorial_de_numero_for {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número", "Factorial de un nümero!!", JOptionPane.QUESTION_MESSAGE));
		
		long result = 1L;
		
		for (int i = 1; i <= numero; i++) {
			
			result *= 1;
			System.out.println(result*=i);
			
		}
		
		
		JOptionPane.showMessageDialog(null, result, "Factorial de " + numero + ":", JOptionPane.INFORMATION_MESSAGE);

	}

}
