package a006_for;

import javax.swing.JOptionPane;

public class A03_Comprobar_email {

	public static void main(String[] args) {
		
		int arroba = 0;
		
		boolean punto = false;
		
		String email = JOptionPane.showInputDialog("Introduce tu email: ");
		
		for (int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i) == '@') {
				arroba ++;
			}
			
			if (email.charAt(i) == '.') {
				
				punto = true;
			}
		}
		
		if (arroba == 1 && punto == true) {
			
			JOptionPane.showMessageDialog(null, "Tu email esta correcto");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Tu email esta Incorrecto");
			
		}

	}

}
