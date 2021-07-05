package a007_array;

import javax.swing.JOptionPane;

public class A04_array_ejercicio_1 {

	public static void main(String[] args) {
		

		String[] paises = new String[3];
		
		for (int i = 0; i < paises.length; i++) {
			
			paises[i] = JOptionPane.showInputDialog("Introduce el Pais " + (i+1));
			
		}
		
		for (String i: paises) {
			
			System.out.println(i);
			
		}
			
		
		

	}

}
