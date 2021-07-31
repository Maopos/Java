package retos_ciclo_2;

public class NuevoProyecto {
    
	private int pPeriodo;
	private double pMonto;
	private double pInteres;
	
	public NuevoProyecto(int pPeriodo, double pMonto, double pInteres){
	    this.pPeriodo = pPeriodo;
	    this.pMonto = pMonto;
	    this.pInteres = pInteres;
	}
   
	public NuevoProyecto(){
		this(0, 0, 0);
		
	}
	
	public double calcularInteresSimple() {
		double interesSimple = pMonto * (pInteres/100) * pPeriodo;
		return Math.round(interesSimple);
	}
		
	public double calcularInteresCompuesto (){
		
		double calculo = (Math.pow((1+(pInteres/100)), pPeriodo));
		double interesCompuesto = pMonto * (calculo - 1);
	    return Math.round(interesCompuesto);
	}
	
	
	public double compararInversion (int pPeriodo, double pMonto, double pInteres) {
		
		double interesSimple = pMonto * (pInteres/100) * pPeriodo;
		double calculo = (Math.pow((1+(pInteres/100)), pPeriodo));
		double interesCompuesto = pMonto * (calculo - 1);
		double diferencia = interesCompuesto - interesSimple;
		return Math.round(diferencia);
	}
	
	public double compararInversion () {
		
		double interesSimple = pMonto * (pInteres/100) * pPeriodo;
		double calculo = (Math.pow((1+(pInteres/100)), pPeriodo));
		double interesCompuesto = pMonto * (calculo - 1);
		double diferencia = interesCompuesto - interesSimple;
		return Math.round(diferencia);
	}
		
	public static void main(String[] args){
	    
	    NuevoProyecto np = new NuevoProyecto();
	    
	    System.out.println(np.calcularInteresSimple());
	    System.out.println(np.calcularInteresCompuesto());
	    System.out.println(np.compararInversion(6,10000000,1.2));
	    
	    
	    
	    NuevoProyecto np2 = new NuevoProyecto(6,10000000,1.2);
	    
	    System.out.println(np2.calcularInteresSimple());
	    System.out.println(np2.calcularInteresCompuesto());
	    System.out.println(np2.compararInversion());
	}
    
}
