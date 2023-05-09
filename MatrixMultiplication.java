package task2;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colomn and number of row same");
		System.out.println("Enter the number " + "of rows of the matrix");
		int m = sc.nextInt();
		System.out.println("Enter the number " + "of columns of the matrix");
		int n = sc.nextInt();
		
		int first[][] = new int[m][n];
		
		System.out.println("Enter the elements of the matrix1");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                first[i][j] = sc.nextInt();
        }
        
        int second[][] = new int[m][n];
        System.out.println("Enter the elements of the matrix2");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                second[i][j] = sc.nextInt();
        }
        
        int c[][]=new int[m][n]; 
        
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		c[i][j]=0;
        		
        		for(int k=0;k<m;k++) {
        			c[i][j]+=first[i][k]*second[k][j];
        		}
        		System.out.print(c[i][j]+" "); 
        	}
        	System.out.println();
        }

	}

}
