package a007_array;

public class A04_array_ejercicio_2 {

	public static void main(String[] args) {
		
		int[] matriz = new int[155];
		
		for (int i = 0; i < matriz.length; i++) {
			
			matriz[i] = (int)(Math.random()*100);
			
		}
		
		
		int posicion = 0;
		
		for (int i: matriz) {
			
			posicion ++;
			
			if ( posicion != matriz.length) {
				
				System.out.print(i + ", ");
				
			}  else {
				
				System.out.print(i);
			
		}
			
			
		}
		

	}

}
