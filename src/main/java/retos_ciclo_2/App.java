package retos_ciclo_2;

class PrecioTotal { 
	
	private double totalDispositivos; 
	private double totalPortatiles; 
	private double totalTablets;
	private Dispositivo[] listaDispositivos;
	
	PrecioTotal(Dispositivo[] pDispositivos) {
		listaDispositivos = pDispositivos;
		
	}
	
	
	public void mostrarTotales() { 
		
		
		for (int i = 0; i < listaDispositivos.length; i++) {
			
			if(listaDispositivos[i] != null) {
				
				int tipo = listaDispositivos[i].verificar_D();
				if (tipo == 2) {
					totalTablets += listaDispositivos[i].calcularPrecio();
					
				} else if (tipo == 3) {
					totalPortatiles += listaDispositivos[i].calcularPrecio();
					
				} else {
					//totalDispositivos += listaDispositivos[i].calcularPrecio();
				}
				
				totalDispositivos += listaDispositivos[i].calcularPrecio();
			}
			
		}
		
		
		System.out.println("Totalización precios computadores portátiles " + totalPortatiles); 
		System.out.println("Totalización precios tabletas " + totalTablets); 
		System.out.println("Totalización precios dispositivos " + totalDispositivos);
	} 
}

class Dispositivo {
	
	private final int PESO_BASE = 2;
	private final char CONSUMO_W_BASE = 'F';
	private final double PRECIO_BASE = 239;
	
	private int peso;
	private char consumoW;
	private double precioBase;
	
	public Dispositivo(){
		peso = PESO_BASE;
		consumoW = CONSUMO_W_BASE;
		precioBase = PRECIO_BASE;
		
	}
	
	public Dispositivo(Double precioBase, Integer peso){
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoW = CONSUMO_W_BASE;
		
	}
	
	public Dispositivo(Double precioBase, Integer peso, char consumoW){
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoW = consumoW;
		
		comprobarconsumoW(consumoW); 
	}
	
	public int verificar_D() {
		return 1;
	}
	
	public void comprobarconsumoW(char consumoW){
		
		if(consumoW > 10){ 
			
			this.consumoW = consumoW;
		
		} else { 
			
			this.consumoW = CONSUMO_W_BASE;
		} 
	}
	
	public Double calcularPrecio(){
		
		 
		 /*
		  * si el consumo energético (consumoW) del dispositivo es ‘A’, se adiciona $118, 
		  * si es ‘B’ se adiciona $90, si es ‘C’ se adiciona $78, si es ‘D’ se adiciona $45, 
		  * si es ‘E’ se adiciona $30 y si es ‘F’ se adiciona $19.
		  * */
		
		double adicion_consumo = 0;
		 
		 if(this.consumoW == 'A') {
			 adicion_consumo = 118;
		 } else if (this.consumoW == 'B') {
			 adicion_consumo = 90;
		 } else if (this.consumoW == 'C') {
			 adicion_consumo = 78;
		 } else if (this.consumoW == 'D') {
			 adicion_consumo = 45;
		 } else if (this.consumoW == 'E') {
			 adicion_consumo = 30;
		 } else if (this.consumoW == 'F') {
			 adicion_consumo = 19;
		 } 
		
		 
		 double adicion_peso = 0;
		 /*
		  * si el peso del dispositivo es mayor a 1 y menor o igual a 2 se adiciona $48, 
		  * si el peso es mayor a 2 y menor o igual a 3 se adiciona $39, 
		  * si el peso es mayor a 3 y menor o igual a 4 se adiciona $30 
		  * si el peso es mayor a 4 se adiciona $25.
		  * */
		 
		 if (peso > 1 && peso <= 2) {
			 adicion_peso = 48;
		 } else if (peso > 2 && this.peso <= 3) {
			 adicion_peso = 39; 
		 } else if (peso > 3 && this.peso <= 4) {
			 adicion_peso = 30; 
		 } else if (peso > 4 ) {
			 adicion_peso = 25; 
		 }
		 
		 
		  return precioBase + adicion_consumo + adicion_peso; 
	}
}


class Tablet extends Dispositivo{
	
	private final int MEMORIA_RAM_BASE = 1;
	private int memoriaRam;

	public Tablet(){ 
		super();
		memoriaRam = MEMORIA_RAM_BASE;
	}
		
	public Tablet(Double precioBase, Integer peso){ 
		super(precioBase, peso);
		memoriaRam = MEMORIA_RAM_BASE;
	}
	
	public Tablet(Double precioBase, Integer peso, char consumoW, Integer memoriaRam){ 
		super(precioBase, peso, consumoW);
		
		this.memoriaRam = memoriaRam;
	}
	
		
	public int verificar_D() {
		return 2;
	}
	
	public Double calcularPrecio(){ 
		
		double viene = super.calcularPrecio(); 
		
		double adicion_memoria = 0;
		
		
		if (memoriaRam > 1 && memoriaRam <= 2) {
			adicion_memoria = 38;
		} else if (memoriaRam > 2 && memoriaRam <= 4) {
			adicion_memoria = 57;
		} else if (memoriaRam > 4) {
			adicion_memoria = 80;
		}
		
		return viene + adicion_memoria;
	} 
		
}

class Portatil extends Dispositivo{
	
	private final int DISCO_DURO_BASE = 250;
	private int discoDuro;
	
	
	public Portatil(){
		super();
		this.discoDuro = DISCO_DURO_BASE;
	}
	
	public Portatil(Double precioBase, Integer peso){ 
		super(precioBase, peso);
		this.discoDuro = DISCO_DURO_BASE;
	}
	
	public Portatil(Double precioBase, Integer peso, char consumoW, Integer discoDuro){ 
		super(precioBase, peso, consumoW);
		this.discoDuro = discoDuro;
	}
	
	
	
	public int verificar_D() {
		return 3;
	}
	
	
	public Double calcularPrecio(){ 
		
		double viene = super.calcularPrecio();
		
		double adicion_disco = 0;
		
		if (discoDuro > 250 && discoDuro <= 500) {
			adicion_disco = 40;
		} else if (discoDuro > 500 && discoDuro <= 1000) {
			adicion_disco = 90;
		} else if (discoDuro > 1000) {
			adicion_disco = 115;
		}
		
		return viene + adicion_disco;
		
		
	} 
}

public class App {
	public static void main(String[] args) {
		
	
		Dispositivo dispositivos[]=new Dispositivo[3];
		dispositivos[0]=new Portatil(500.0, 3, 'E', 250);
		dispositivos[1]=new Tablet();
		dispositivos[2]=new Dispositivo(600.0, 3, 'D');
		PrecioTotal solucion1 = new PrecioTotal(dispositivos);
		solucion1.mostrarTotales();
		System.out.println();
		
		System.out.println("Totalización precios computadores portátiles 558.0\nTotalización "
				+ "precios tabletas 306.0\nTotalización precios dispositivos 1522.0\n");
		
		Dispositivo dispositivos2[]=new Dispositivo[7];
		dispositivos2[0]=new Tablet(150.0, 1);
		dispositivos2[1]=new Portatil(500.0, 2,'E',500);
		dispositivos2[2]=new Dispositivo();
		dispositivos2[3]=new Portatil(250.0, 4);
		dispositivos2[4]=new Tablet(400.0, 3, 'A', 4);
		dispositivos2[5]=new Dispositivo(50.0, 3);
		PrecioTotal solucion2 = new PrecioTotal(dispositivos2);
		solucion2.mostrarTotales();
		System.out.println();
		
		System.out.println("Totalización precios computadores portátiles 906.0\n"
				+ "Totalización precios tabletas 684.0\n"
				+ "Totalización precios dispositivos 2004.0");
		
	}
}
