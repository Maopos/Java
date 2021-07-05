package b002_Prog_orientada_Objetos;

public class Final_y_Static {

	public static void main(String[] args) {
		
		Empleados empleado_01 = new Empleados("Mauricio Posada");
		Empleados empleado_02 = new Empleados("Daniel Posada");
		Empleados empleado_03 = new Empleados("Sergio Vargas");
		Empleados empleado_04 = new Empleados("Andres cepeda");
		Empleados empleado_05 = new Empleados("Olimpo Cardenas");
		Empleados empleado_06 = new Empleados("Shakira");
		
		
		empleado_01.setSeccion("Contabilidad");
		
		//empleado_02.setNombre("Oscar"); // No se puede llamar este metodo porque Nombre es una constante
		
		System.out.println(empleado_01.getDatos());
		System.out.println(empleado_02.getDatos());
		System.out.println(empleado_03.getDatos());
		System.out.println(empleado_04.getDatos());
		System.out.println(empleado_05.getDatos());
		System.out.println(empleado_06.getDatos());
		
		System.out.println(Empleados.getIdSig());
		System.out.println(Empleados.getIdSig());
		
		System.out.println(Empleados.getIdSig());
		
		
	}

}

class Empleados {
	
	private final String Nombre; // Con final queda una constante
	private String seccion;
	
	private int id;
	private static int idSig = 1;
	
	
	public Empleados (String nombre) { // Constructor
		
		this.Nombre = nombre;
		this.seccion = "Administración";
		id = idSig;
		idSig++;
		
	}
	 
	/*
	public void setNombre(String nombre) { // Este metodo no se puede aplicar porque Nombre ya es una constante
		this.nombre = nombre;
	}
	*/
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "Empleado de codigo " + id + ", nombre es " + this.Nombre + ", de la seccion " + this.seccion;
	}
	
	public static String getIdSig() {
		return "Siguiente Id: " + idSig;
	}
	
	
}
