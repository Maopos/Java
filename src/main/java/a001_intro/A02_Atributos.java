package a001_intro;

public class A02_Atributos {

	public static void main(String[] args) {
		
		int numero = 10; // - 2.147'483.648 - 2.147'483.647
		System.out.println("int: " + numero);
		
		float decimal = 10.0f; 
		System.out.println("float: " + decimal);
		
		double nroDecimal = 10.0;
		System.out.println("double: " + nroDecimal);
		
		boolean result = true;
		System.out.println("boolean: " + result);
		
		char caracter = 'a';
		System.out.println("char: " + caracter);
		
		/*
		Data Type	Size		Description
		
		byte		1 byte		-128 to 127
		short		2 bytes		-32,768 to 32,767
		int			4 bytes		-2,147,483,648 to 2,147,483,647
		long		8 bytes		-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		float		4 bytes		Sufficient for storing 6 to 7 decimal digits
		double		8 bytes		Sufficient for storing 15 decimal digits
		
		boolean		1 bit		Stores true or false values
		char		2 bytes		Stores a single character/letter or ASCII values
		*/
		
	}

}
