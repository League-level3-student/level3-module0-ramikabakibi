package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {

    public int getSumByRow(int[][] matrix, int row) {
        int rowSum=0;
   
       for(int i=0; i<matrix[row].length; i++) {
    	   rowSum+= matrix[row][i];
       }
     return rowSum;
    }
    
    public int getSumByColumn(int[][] matrix, int col) {
        int colSum=0;
        
        for(int i=0; i<matrix.length; i++) {
        	colSum+= matrix[i][col];
        }
        
        return colSum;
    }
}
