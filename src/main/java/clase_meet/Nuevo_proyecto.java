package clase_meet;

public class Nuevo_proyecto {
	
		double pMonto;       //VAriables
		double pInteres;
		int pPeriodo;
		
	
	
	public double interesSimple() {  // metodo 1
		
		double interesSimple = pMonto * (pInteres/100) * pPeriodo;
		
		return interesSimple;
		
	}
	
	
	
	public Nuevo_proyecto(double pMonto, double pInteres, int pPeriodo) { // Constructor
		
		this.pPeriodo = pPeriodo;
		this.pMonto = pMonto;
		this.pInteres = pInteres;
		
	}
	

	public static void main(String[] args) {
		
		Nuevo_proyecto np = new Nuevo_proyecto(20000, 15, 12);
		
		System.out.println(np.interesSimple());

	}

}
