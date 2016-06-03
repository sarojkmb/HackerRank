import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
You are given a square map of size . Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.


*/
public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        String grid[] = new String[n];
        int[][] matrix=new int[n][n];
        char[][] mat=new char[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            char[] arr=new char[4];
            arr=grid[grid_i].toCharArray();
            for(int j=0;j<n;j++){
                matrix[grid_i][j]=Character.getNumericValue(arr[j]);
                //System.out.println(matrix[grid_i][j]);
                mat[grid_i][j]=arr[j];
            }
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(matrix[i][j]>matrix[i-1][j] && matrix[i][j]>matrix[i][j-1] && matrix[i][j]>matrix[i+1][j] && matrix[i][j]>matrix[i][j+1]){
                    count++;
                    mat[i][j]='X';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 System.out.print(mat[i][j]);                   
                
            }
            System.out.println("");
        }
       
    }
}
