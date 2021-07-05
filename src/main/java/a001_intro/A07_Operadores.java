package a001_intro;

public class A07_Operadores {

	public static void main(String[] args) {
		
		System.out.println("== Operadores aritmeticos ==\n");
		
		int num_1 = 3;
		int num_2 = 9;
		
		int result;
		
		result = num_1 + num_2;
		System.out.println(result);
		
		result = num_2 - num_1;
		System.out.println(result);

		result = num_1 * num_2;
		System.out.println(result);

		result = num_2 / num_1;
		System.out.println(result);
		
		System.out.println("\n== Operadores de asignación ==\n");
		
		int res = 10;
		res += 5;
		System.out.println(res);
		
		res -= 5;
		System.out.println(res);

		res *= 5;
		System.out.println(res);
		
		res /= 5;
		System.out.println(res);
		
		res %= 5;
		System.out.println(res);
		
		System.out.println("\n== Operadores de relacionales ==\n");
		
		if(res != 5) { 						// ==, <=, >=, <, >, !=
			System.out.println(true);
		}
		
		System.out.println("\n== Operadores incrementales ==\n");
		
		res ++;
		res ++;
		System.out.println(res++); // Primero muestra res luego suma
		System.out.println(res);   // Aca si muestra la suma realizada
		
		System.out.println(++res); // Primero suma y luego muestra res
		
		int a = 5;
		System.out.println(6 == a++); // Aca se muestra false porque 6 != 5
		
		a--;						  // a vuelve a ser 5
		System.out.println(6 == ++a); // Aca se muestra true porque 6 == 6
		
		
	}

}
