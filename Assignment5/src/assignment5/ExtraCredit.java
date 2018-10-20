/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order. (Score 2)

For example, Given the following matrix: 
{{1,2,3},
{4,5,6},
{7,8,9}}
You should return {1,2,3,6,9,8,7,4,5}.

public List<Integer> spiralOrder(int[][] matrix) {
         //write your code here
}
 */

package assignment5;

import java.util.ArrayList;

public class ExtraCredit {
	public static ArrayList<Integer> spiralOrder(int m, int n, int matrix[][]){
		int j = 0, i =0; //m is the ending of row, n is the ending of column, j is the start of row, i is the start of column
		int a; //iterator
  //matrix[row][column]
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(j < m && i < n) {
      //print the first row 
			for(a = i; a < n; ++a) {
				list.add(matrix[j][a]);
				//System.out.print(matrix[j][a] + ", ");
			}
			j++;
			//print the remaining last column
			for(a = j; a < m; ++a)
			{
				list.add(matrix[a][n-1]);
				//System.out.print(matrix[a][n-1] + ", ");
				}
			n--;
			//print the remaining last row
			for(a = n - 1; a >= 0; --a) {
				list.add(matrix[m-1][a]);
				//System.out.print(matrix[m-1][a] + ", ");
			}
			m--;
//print the second last remaining row
			for(a = i; a < n - 2; ++a) {
				list.add(matrix[m-1][a]);
				//System.out.print(matrix[m-1][a] + ", ");
			}
			i++;
		}
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		int m = 3, n = 3;
		int matrix[][] = {{1, 2, 3},
				                               {4, 5, 6},
				                               {7, 8 ,9}};
		spiralOrder(m, n, matrix);
		}
		
	}
