package a005_while_do_while;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class A06_Contraseña_while {

	public static void main(String[] args) {
		
		String clave = "Mauricio";
		
		String password = "";
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		
		while (!clave.equals(password)) {
			
			password = JOptionPane.showInputDialog("Introduce la contraseña:");
			
			if (clave.equals(password) == false) {
				System.out.println("Contraseña Incorrecta...");
			}
			
		}
		
		System.out.println("Acceso Permitido...");
		
		entrada.close();
		
	}

}
