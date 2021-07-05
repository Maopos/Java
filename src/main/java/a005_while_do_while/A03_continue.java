package a005_while_do_while;

public class A03_continue {

	public static void main(String[] args) {
		
		int contador = 0;
		
		do {
			
			if (contador % 2 != 0) {
				continue;
			}
			
			System.out.println(contador);
			
			
		} while (contador++ < 20);
		

	}

}
