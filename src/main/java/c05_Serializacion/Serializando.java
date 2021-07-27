package c05_Serializacion;

import java.util.*;
import java.io.*;

public class Serializando {

	 public static void main(String[] args) {
	  
	  Administrador jefe = new Administrador("Juan de Arco", 800, 2017, 03, 8);
	  
	  jefe.setIncentivo(5000);
	  
	  Empleado[] personal = new Empleado[4];
	  personal[0] = jefe;
	  personal[1] = new Empleado("Ana Arcos", 25000,2008,10,1);
	  personal[2] = new Empleado("Luis Madina", 18000,2012,9,15);
	  personal[3] = new Administrador("Mauricio Posada", 37000, 2021, 12, 12);
	  
	  
	  
	  try {
		  
		  ObjectOutputStream archivoObj = new ObjectOutputStream(new FileOutputStream("src/main/java/c05_Serializacion/empleado.txt"));
		  
		 archivoObj.writeObject(personal);
		 
		 archivoObj.close();
		 
		 
		 ObjectInputStream lectura_Archivo = new ObjectInputStream(new FileInputStream("src/main/java/c05_Serializacion/empleado.txt"));
		 
		 Empleado[] consulta_personal = (Empleado[])lectura_Archivo.readObject();
		 
		 for (Empleado i: consulta_personal) {
			 System.out.println(i);
		 }
		 
		 lectura_Archivo.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	  
	  
	 }

}

class Empleado implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nombre;
	double sueldo;
	Date fechaContrato;
	
	
	public Empleado(String n, double s, int agno, int mes, int dia){
			
		nombre = n;
		sueldo = s;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		fechaContrato = calendario.getTime();
		
	 }
		
		
	 public String getNombre() {
		 	return nombre;
	 }
	 
	 public void setNombre(String nombre) {
		 	this.nombre = nombre;
	 }
	 
	 public double getSueldo() {
		 	return sueldo;
	 }
	 
	 public void setSueldo(double sueldo) {
		 	this.sueldo = sueldo;
	 }
	 
	 public Date getFechaContrato() {
		 	return fechaContrato;
	 }
	 
	 public void setFechaContrato(Date fechaContrato) {
		 	this.fechaContrato = fechaContrato;
	 }
	 
	 public void SubirSueldo(double porcentaje){
		 	double aumento = sueldo*porcentaje/100;
		 	sueldo+=aumento;
	 }
	 
	 public String toString(){
		 	return "Nombre: " + nombre + ", Sueldo: " + sueldo + ", Fecha de contrato: " + fechaContrato;
	 }
	 
}
	
class Administrador extends Empleado{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double incentivo;
		
	public Administrador(String n, double s, int agno, int mes, int dia){
			
		super(n,s,agno,mes,dia);
		incentivo = 0;
			
	}
		
	public double getSueldo() {
	 		double sueldoBase = super.getSueldo();
	 		return sueldoBase+incentivo;
	}
 
	public void setIncentivo(double incentivo) {
	 		this.incentivo = incentivo;
	}
 
	public String toString(){
	 		return super.toString()+ ", Incentivo: " + incentivo;
	}
 
	 
}
