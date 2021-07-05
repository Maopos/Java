package b001_Prog_Orientada_Objetos;

public class Van extends Carro{
	
	private int capacidad_extra;
	private int plazas_extra;
	
	public Van(int cap_x, int plaz_x) {
		
		super(); // Llama al metodo constructor de la clase padre
		
		this.capacidad_extra = cap_x;
		this.plazas_extra = plaz_x;
		
	}

	public String getDatosVan(){
		return " La capacidad de carga es " + this.capacidad_extra + ", tiene " + this.plazas_extra + " plazas extra.";
	}

}
