package a007_array;

public class A06_Matriz_Intereses {

	public static void main(String[] args) {
		
		double acumulado;
		
		double interes = 0.10;
		
		double[][] saldo = new double[6][5];
		
		int monto = 10000;
		
		
		for (int i = 0; i < saldo.length; i++) {
			
			saldo[i][0] = monto;
			acumulado = monto;
			
			for (int j = 1; j  < saldo[i].length; j++) {
				
				acumulado += (acumulado * interes);
				saldo[i][j] = acumulado;
				
				
			}
			
			interes += 0.01;
		}
		
		for (double[] i: saldo) {
			System.out.println();
			for (double j: i) {
				
				System.out.printf("%,1.2f", j);
				System.out.print(" ");
			}
			
		}

	}

}
