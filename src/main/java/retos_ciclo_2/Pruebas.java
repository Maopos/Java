package retos_ciclo_2;

public class Pruebas {

	public static void main(String[] args) {
		
		Vehiculo miVehiculo = new Vehiculo();
		Vehiculo miVehiculo2 = new Vehiculo(50);
		
		Camion micamion = new Camion();
		
		System.out.println(miVehiculo.getVelocidad());
		System.out.println(miVehiculo2.getVelocidad());
		System.out.println(micamion.getVelocidad());
		
		
		
	}

}

class Vehiculo {
	
	private int velocidad;
	private final int VEL_INICIAL = 10;
	
	public Vehiculo () {
		velocidad = VEL_INICIAL;
	}
	
	public Vehiculo(int vel) {
		velocidad = vel;
		
	}
	
	public int getVelocidad() {
		int vel_final = velocidad * 2;
		return vel_final;
	}
	
}

class Camion extends Vehiculo{
	
	
	public Camion() {
		super();
	}
	
	public Camion(int vel) {
		super();
		
	}
	
	public int getVelocidad() {
		int viene = super.getVelocidad();
		
		
		return viene/2;
	}
}


