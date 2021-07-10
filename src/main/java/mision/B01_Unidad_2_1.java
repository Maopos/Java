package mision;

import java.util.Scanner;

public class B01_Unidad_2_1 {

	public static void main(String[] args) {
		
		Carro vehiculo_01 = new Carro();
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("\n-- Concesionario los coches --\n");
		System.out.print("Ingrese el nombre del vehiculo: ");
		String nombre = entrada.nextLine();
		System.out.print("Ingrese la marca del vehiculo: ");
		String marca = entrada.nextLine();
		System.out.print("Ingrese el modelo del vehiculo: ");
		int modelo = entrada.nextInt();
		
		vehiculo_01.setNombre(nombre);
		vehiculo_01.setMarca(marca);
		vehiculo_01.setModelo(modelo);
		
		System.out.println(vehiculo_01.getDatos());
		
		entrada.close();

	}

}
class Carro{
	
	private String nombre;
	private String marca;
	private int modelo;
	
	public Carro() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getDatos() {
		return "El vehiculo "  + this.nombre + " " + this.marca + " del año " + this.modelo + " esta disponible.";
	}
}