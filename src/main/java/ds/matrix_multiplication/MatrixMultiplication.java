package ds.matrix_multiplication;

import java.util.Arrays;

public class MatrixMultiplication
{
	public static void main( String[] args )
	{	//works only if a[0].length == b[0].length.
		// resultant array will be of order [a.length][b[0].length] 
		int a [][] = {{ 10, 8, 12 }, { 11, 8, 12}, { 9, 7, 10}, { 10, 7, 13}};
	    int b [][] = {{1250}, {400}, {250}};
	    
	    int res [][] = multiplyMatrices(a, b);
	    System.out.println(Arrays.deepToString(res).replaceAll("\\],", "],\n"));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 * number of columns in the left matrix should be equal to number of rows in the right matrix
	 */
	static int[][] multiplyMatrices(int[][] a, int[][] b) {
		if(a[0].length != b.length)
			return null;
		
		int [][] res = new int[a.length][b[0].length];
		
		int leftRows = a.length;
		int leftColumnsRightRows = a[0].length;
		int rightColumns = b[0].length;
		
		for(int i = 0; i<leftRows; i++) {
			for(int j=0; j<rightColumns; j++) {
				for(int k=0; k<leftColumnsRightRows; k++) {
					res[i][j] = res[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return res;
	}
	
	
}