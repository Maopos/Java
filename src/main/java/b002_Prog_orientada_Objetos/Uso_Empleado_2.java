package b002_Prog_orientada_Objetos;

import java.util.Date;
import java.util.GregorianCalendar;




public class Uso_Empleado_2 {
	
	public static void main(String[] args) {
		
		
		Empleado_2 empleado_01 = new Empleado_2("Mauricio Posada", 85000, 2017, 04, 22);
		Empleado_2 empleado_02 = new Empleado_2("Katerine Escobar", 95000, 1995, 06, 2);
		Empleado_2 empleado_03 = new Empleado_2("Magnus Olivetto", 105000, 2002, 03, 15);
		Empleado_2 empleado_04 = new Empleado_2("Cony Camelo");
		
		Jefe jefe_01 = new Jefe("Elvis Crespo", 150000, 2018, 9, 25);
		
		jefe_01.setPrima(8000);
		
		Empleado_2[] nomina = new Empleado_2[6];
		
		nomina[0] = empleado_01;
		nomina[1] = empleado_02;
		nomina[2] = empleado_03;
		nomina[3] = empleado_04;
		nomina[4] = jefe_01;
		nomina[5] = new Jefe("Maria", 90000, 2016, 5, 3);
		
		Jefe jefe_02 = (Jefe) nomina[5]; // Casting
		
		jefe_02.setPrima(8000);
		
		
		for (Empleado_2 i: nomina) {
			i.setAumentoSueldo(6);
			System.out.println("Empleado 001: " + i.getNombre());
			System.out.println("Fecha de Ingreso: " + i.getAltaContrato());
			System.out.println("Actualmente devenga: $" + i.getSueldo());
			System.out.println();
		}
		
	}
	
}

class Empleado_2 {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
	public Empleado_2(String nombre, double sueldo, int año, int mes, int dia) { 		// Constructor 1
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado_2(String nombre) { 													// Constructor 2
		
		this(nombre, 30000, 2000, 1, 1);
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	public void setAumentoSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
}

class Jefe extends Empleado_2{
	
	private double prima;
	
	
	public Jefe(String nombre, double sueldo, int año, int mes, int dia) {
		
		super(nombre, sueldo, año, mes, dia); 									// Llama al metodo constructor de la clase padre
		
	}
	
	public void setPrima(double prima) { 
		this.prima = prima;
	}
	
	public double getSueldo() {
		
		double sueldo_jefe = super.getSueldo();
		
		return sueldo_jefe + prima;
	}
}
