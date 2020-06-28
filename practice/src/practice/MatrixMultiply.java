package practice;

public class MatrixMultiply {
	public void multiply(int arr1[][],int arr2[][],int row1,int col1,int row2,int col2) {
		int[][] arr3 = new int[row1][col2];
		if(col1==row2) {
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					arr3[i][j]=0;
					for(int k=0;k<col1;k++) {
						arr3[i][j] = arr3[i][j]+(arr1[i][k]*arr2[k][j]);
					}
				}
			}
		}
		else {
			System.out.println("Array multiplication not possible");
			return;
		}
		System.out.println("Matrix multiplication of 3rd array....");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
