package clase_meet;

public class Ejemplo {
	
	public static void main(String[] args) {
		
		Carro fabricante = new Carro("Amarillo", "Ford"); // instanciamos un objeto
		
		fabricante.cambiamecolor("Negro");
		System.out.println(fabricante.dame_el_Color());
		System.out.println(fabricante.dameMarca());
	}
}
class Carro {
	
	private String color;
	private String marca;
	
	public Carro() {  								// constructor 1
		this("Pendiente", "Pendiente");
	}
	
	public Carro(String color, String marca) { 		// constructor 2 - tiene el mismo nombre que la clase
		this.marca = marca;
		this.color = color;
	}
	
	
	public void cambiamecolor(String n_color){      // Set - configurame - nombrame - cambiame
		
		this.color = n_color;
	}
	
	public String dame_el_Color(){  				// GET - dame - capturame - traeme -muestrame
		
		return color;
	}
	
	public String dameMarca() {
		marca = "su marca es " + marca;
		return marca;
	}
	
}