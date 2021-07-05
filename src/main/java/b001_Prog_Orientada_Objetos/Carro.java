package b001_Prog_Orientada_Objetos;

public class Carro {
	
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos, aire_acondicionado;
	
	
	public Carro() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}

	public String getDatos() {
		return "Este carro tiene " + ruedas + " ruedas, mide " + largo + " centimetros de largo, " + ancho + 
				" centimetros de ancho, \nTiene un motor de " + motor + " CC, un peso de plataforma de " + 
				peso_plataforma + " Kgs.";
	}
	

	public void setAsientos(String asientos_cuero) {
		if (asientos_cuero.equals("si")) {
			this.asientos = true;
		} else {
			this.asientos = false;
		}
	}
	
	
	
	public String getAsientos() {
		if (asientos == true) {
			return "Este carro tiene asientos en cuero";
		} else {
			return "Este carro tiene asientos en tela";
		}
	}

	

	public void setColor(String color_carro) {
		color = color_carro;
	}
	
	
	public String getColor() {
		return "El color de este carro es " + color;
	}
	
	public void setAire(String aire) {
		if (aire.equals("si")) {
			this.aire_acondicionado = true;
		} else {
			this.aire_acondicionado = false;
		}
	}
	
	public String getAire() {
		if (aire_acondicionado == true) {
			return "Este carro tiene aire acondicionado";
		} else {
			return "Este carro No tiene aire acondicionado";
		}
	}
	
	public String getPesoTotal() {
		
		int peso_carroceria = 500;
		peso_total = peso_carroceria + peso_plataforma;
		
		if (asientos == true) {
			peso_total += 50;
		}
		if (aire_acondicionado) {
			peso_total += 20;
		}
		return "El peso total de este carro es: " + peso_total + " Kgs.";
	}
	
	public int getPrecio() {
		int precio_final = 10000;
		if (asientos) {
			precio_final += 2000;
		}
		if (aire_acondicionado) {
			precio_final += 1500;
		}
		return precio_final;
				
	}
}
