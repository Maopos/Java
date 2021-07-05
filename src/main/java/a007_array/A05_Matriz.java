package a007_array;

public class A05_Matriz {

	public static void main(String[] args) {
		
		int[][] matrix = new int[5][5];
		
//		matrix[0][0] = 3;
//		matrix[0][1] = 5;
//		matrix[0][2] = 7;
//		matrix[0][3] = 1;
//		matrix[0][4] = 0;
//		
//		matrix[1][0] = 6;
//		matrix[1][1] = 4;
//		matrix[1][2] = 8;
//		matrix[1][3] = 2;
//		matrix[1][4] = 3;
//		
//		matrix[2][0] = 0;
//		matrix[2][1] = 1;
//		matrix[2][2] = 9;
//		matrix[2][3] = 3;
//		matrix[2][4] = 5;
//		
//		matrix[3][0] = 5;
//		matrix[3][1] = 6;
//		matrix[3][2] = 0;
//		matrix[3][3] = 7;
//		matrix[3][4] = 8;
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				matrix[i][j] = (int)(Math.random()*10);
				
			}
			
		}
		
		
		for (int[] i: matrix) {
			System.out.println();
			for (int j: i) {
				System.out.print(j + " ");
			}
		}
		
		
			
		

	}

}
