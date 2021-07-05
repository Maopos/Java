package a004_estructura_switch;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class A06_Areas_Geometricas {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Elige una figura Geométrica: \n\n1. Cuadrado \n2. Rectángulo \n3. Triángulo \n4. Círculo");
		
		int opcion = entrada.nextInt();
		
		
		switch (opcion) {
		
		case 1: 
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado: "));
			System.out.println("El Área del cuadrado es: " + Math.pow(lado, 2));
			break;
			
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del Rectángulo: "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del Rectángulo: "));
			System.out.println("El Área del cuadrado es: " + (base * altura));
			break;
			
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del Triángulo: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del Triángulo: "));
			System.out.println("El Área del cuadrado es: " + ((base * altura)/2));
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del Círculo: "));
			System.out.print("El Àrea del circulo es: ");
			System.out.printf("%,1.2f", Math.PI * (Math.pow(radio, 2)));
			break;
			
		default:
			System.out.println("La opción no es correcta.");
		}
		
		entrada.close();
		 
	
		
	}

}
