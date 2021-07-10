package b003_POO_clase_abstract;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		
		Persona[] personas = new Persona[4];
		
		personas[0] = new Empleados("Alejandro Gracia", 95000, 2010, 02, 03);
		personas[1] = new Alumno("Marisela Junin", "Administración");
		personas[2] = new Alumno("Gabriel Esteven", "Ingenieria");
		personas[3] = new Empleados("Gustavo Meza", 83000, 2017, 05, 8);
		
		Empleados empleado_02 = (Empleados)personas[3]; // Casting
		empleado_02.setSeccion("Ventas");
		
		
		for (Persona i: personas) {
			System.out.println(i.getNombre() + ", " + i.getDescripcion());
			System.out.println();
		}
		
	} 

}
abstract class Persona {
	
	private String nombre;
	
	public Persona(String nombre) { // Constructor
		this.nombre = nombre;
	}
	
	public String getNombre() { // get dame nombre
		return nombre;
	}
	
	public abstract String getDescripcion(); // get abstracto
	
}

class Empleados extends Persona{
	
	private String seccion;
	private double sueldo;
	private Date altaContrato;
	
	private int id;
	private static int idSig = 1001;
	
	
	public Empleados (String nombre, double sueldo, int año, int mes, int dia) { // Constructor
		
		super(nombre);
		
		this.seccion = "Envíos";
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
		this.altaContrato = calendario.getTime();
		id = idSig;
		idSig++;
		
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
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	
	public String getDescripcion() {
		
		return "El Empleado " + getNombre() + " con id: " + id + " de la sección de " + seccion +  ", tiene un sueldo de: $" + sueldo;
	}
	
}

class Alumno extends Persona{
	
	private String carrera;
	
	private int id;
	private static int idSig = 1001;
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		
		this.carrera = carrera;
		id = idSig;
		idSig++;
		
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	
	public String getDescripcion() {
		
		return "El Alumno " + getNombre() +  " con id: " + id + ", está cursando la carrera de: " + carrera;
	}
}
