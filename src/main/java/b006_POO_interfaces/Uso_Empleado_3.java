package b006_POO_interfaces;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class Uso_Empleado_3 {

	
	public static void main(String[] args) {
		
		
		Empleado_3 empleado_01 = new Empleado_3("Mauricio Posada", 2, 85000, 2017, 04, 22);
		Empleado_3 empleado_02 = new Empleado_3("Katerine Escobar", 1, 95000, 1995, 06, 2);
		Empleado_3 empleado_03 = new Empleado_3("Magnus Olivetto", 4, 105000, 2002, 03, 15);
		Empleado_3 empleado_04 = new Empleado_3("Cony Camelo");
		
		Jefe_3 jefe_01 = new Jefe_3("Elvis Crespo", 3, 150000, 2018, 9, 25);
		
		jefe_01.setPrima(8000);
		
		Empleado_3[] nomina = new Empleado_3[8];
		
		nomina[0] = empleado_01;
		nomina[1] = empleado_02;
		nomina[2] = empleado_03;
		nomina[3] = empleado_04;
		nomina[4] = jefe_01;
		nomina[5] = new Jefe_3("Maria Restrepo", 5, 90000, 2016, 5, 3);
		
		Jefe_3 jefe_02 = (Jefe_3) nomina[5]; // Casting
		
		jefe_02.setPrima(8000);
		
		Empleado_3 jefe_03 = new Jefe_3("Sandra Riascos", 6, 75000, 2018, 12, 24);
		nomina[6] = jefe_03;
		
		@SuppressWarnings("rawtypes")
		Comparable empleado_05 = new Empleado_3("Raul Arciniegas", 7, 87000, 2017, 8, 10);
		nomina[7] = (Empleado_3)empleado_05;
		
		if (empleado_05 instanceof Empleado_3) {
			System.out.println("Es un Jefe.");
		}
		
		if (empleado_05 instanceof Comparable) {
			System.out.println("Implementa la interfaz.");
		}
		
		System.out.println(jefe_01.tomarDecisiones("Ordenó reunión 14 hr."));
		
		Arrays.sort(nomina);
		
		
		for (Empleado_3 i: nomina) {
			i.setAumentoSueldo(6);
			System.out.print("Empleado " + i.getId() + " " + i.getNombre() + ", ");
			System.out.print("	Fecha de Ingreso: " + i.getAltaContrato() + ", ");
			System.out.printf("Actualmente devenga: $%,1.2f", i.getSueldo());
			
			
			System.out.println();		
		}
		
	}
	
}

@SuppressWarnings("rawtypes")
class Empleado_3 implements Comparable{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	
	
	
	public Empleado_3(String nombre, int id, double sueldo, int año, int mes, int dia) { 		// Constructor 1
		
		this.nombre = nombre;
		this.id = id;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado_3(String nombre) { 															// Constructor 2
		
		this(nombre, 101, 30000, 2000, 1, 1);
		
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
	
	public int getId() {
		return id;
	}

	
	public int compareTo(Object miObjeto) {
		
		Empleado_3 otroEmpleado = (Empleado_3)miObjeto;
		
		if (this.id < otroEmpleado.id) {
			return -1;
		}
		if (this.id > otroEmpleado.id) {
			return 1;
		}
		
		return 0;
	}
	
}

class Jefe_3 extends Empleado_3 implements Jefes{
	
	private double prima;
	
	
	public Jefe_3(String nombre, int id, double sueldo, int año, int mes, int dia) {
		
		super(nombre, id, sueldo, año, mes, dia); 										// Llama al metodo constructor de la clase padre
		
	}
	
	public void setPrima(double prima) { 
		this.prima = prima;
	}
	
	public double getSueldo() {
		
		double sueldo_jefe = super.getSueldo();
		
		return sueldo_jefe + prima;
	}

	
	public String tomarDecisiones(String decision) {
		
		return "Un Jefe ha tomado la decision de: " + decision;
	}
}

