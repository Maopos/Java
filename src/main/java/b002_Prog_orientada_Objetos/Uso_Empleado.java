package b002_Prog_orientada_Objetos;

import java.util.Date;
import java.util.GregorianCalendar;


public class Uso_Empleado {

	public static void main(String[] args) {
		
		
		Empleado empleado_001 = new Empleado("Mauricio Posada", 85000, 2017, 04, 22);
		Empleado empleado_002 = new Empleado("Katerine Escobar", 95000, 1995, 06, 2);
		Empleado empleado_003 = new Empleado("Magnus Olivetto", 10500, 2002, 03, 15);
		
		/*
		empleado_001.setAumentoSueldo(05);
		empleado_002.setAumentoSueldo(05);
		empleado_003.setAumentoSueldo(05);
		
		System.out.println("Empleado 001: " + empleado_001.getNombre());
		System.out.println("Fecha de Ingreso: " + empleado_001.getAltaContrato());
		System.out.println("Actualmente devenga: $" + empleado_001.getSueldo());
		System.out.println();
		
		System.out.println("Empleado 002: " + empleado_002.getNombre());
		System.out.println("Fecha de Ingreso: " + empleado_002.getAltaContrato());
		System.out.println("Actualmente devenga: $" + empleado_002.getSueldo());
		System.out.println();
		
		System.out.println("Empleado 003: " + empleado_003.getNombre());
		System.out.println("Fecha de Ingreso: " + empleado_003.getAltaContrato());
		System.out.println("Actualmente devenga: $" + empleado_003.getSueldo());
		System.out.println();
		*/
		
		Empleado[] nomina = new Empleado[3];
		
		nomina[0] = empleado_001;
		nomina[1] = empleado_002;
		nomina[2] = empleado_003;
		
		
//		for (int i = 0; i < nomina.length; i++) {
//			nomina[i].setAumentoSueldo(5);
//			System.out.println("Empleado 001: " + nomina[i].getNombre());
//			System.out.println("Fecha de Ingreso: " + nomina[i].getAltaContrato());
//			System.out.println("Actualmente devenga: $" + nomina[i].getSueldo());
//			System.out.println();
//		}
		
		for (Empleado i: nomina) {
			i.setAumentoSueldo(5);
			System.out.println("Empleado 001: " + i.getNombre());
			System.out.println("Fecha de Ingreso: " + i.getAltaContrato());
			System.out.println("Actualmente devenga: $" + i.getSueldo());
			System.out.println();
		}
		
		

	}
	
}


	class Empleado {
		
		private String nombre;
		private double sueldo;
		private Date altaContrato;
		
		
		
		public Empleado(String nombre, double sueldo, int año, int mes, int dia) {
			
			this.nombre = nombre;
			this.sueldo = sueldo;
			GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
			altaContrato = calendario.getTime();
			
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