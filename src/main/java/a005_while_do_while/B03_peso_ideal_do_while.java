package a005_while_do_while;


import javax.swing.JOptionPane;

public class B03_peso_ideal_do_while {

	public static void main(String[] args) {
		
		
		
		String genero;
		
		do {
			
			
			genero = JOptionPane.showInputDialog(null, "Cual es tu género?: ", "Averigua tu peso ideal!!", JOptionPane.QUESTION_MESSAGE);
			
			
			
		} while (genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("F") == false);

		
		int altura = 0;
		int pesoIdeal = 0;
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu altura en cm?: ", altura));
		
		if (genero.equalsIgnoreCase("M")) {
			
			pesoIdeal = altura - 110;
			
		} else {
			
			pesoIdeal = altura - 120;
			
		}
		
		JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + pesoIdeal + "Kg.");
		
		


	}

}
