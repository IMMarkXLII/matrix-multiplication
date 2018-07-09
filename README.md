# matrix-multiplication

```
  /* 
    number of columns in the left matrix should be equal to number of rows in the right matrix
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
```
