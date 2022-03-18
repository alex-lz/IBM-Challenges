package arrays;
/**
Create a function that prints the following matrix
1 1 1 1 1
0 1 0 1 0
0 0 1 0 0
0 1 0 1 0
1 1 1 1 1

Create a function that prints the following matrix(spiral)

1     2    3   4
12   13   14   5
11   16   15   6
10    9    8   7
 */
public class Matriz {

    public static void main(String[] args) {

        // When instantiating an array, you give it sizes, not indices
        int[][] arr = new int[5][5];
    
        // These are all the valid index combinations for this array
        arr[0][0] = 1; arr[0][1] = 1; arr[0][2] = 1; arr[0][3] = 1; arr[0][4] = 1;
        arr[1][0] = 0; arr[1][1] = 1; arr[1][2] = 0; arr[1][3] = 1; arr[1][4] = 0;
        arr[2][0] = 0; arr[2][1] = 0; arr[2][2] = 1; arr[2][3] = 0; arr[2][4] = 0;
        arr[3][0] = 0; arr[3][1] = 1; arr[3][2] = 0; arr[3][3] = 1; arr[3][4] = 0;
        arr[4][0] = 1; arr[4][1] = 1; arr[4][2] = 1; arr[4][3] = 1; arr[4][4] = 1;
        
        printMatriz(arr);

        System.out.println("");

        int[][] matrix = new int[4][4];
        matrix[0][0] =  1; matrix[0][1] =  2; matrix[0][2] =  3; matrix[0][3] = 4;
        matrix[1][0] = 12; matrix[1][1] = 13; matrix[1][2] = 14; matrix[1][3] = 5;
        matrix[2][0] = 11; matrix[2][1] = 16; matrix[2][2] = 15; matrix[2][3] = 6;
        matrix[3][0] = 10; matrix[3][1] =  9; matrix[3][2] =  8; matrix[3][3] = 7;
    
        printSpiralMatriz(matrix);
    
    }

    public static void printMatriz(int[][] mat){

         // base case
         if (mat == null || mat.length == 0) {
            return;
        }

        for (int x = 0; x < mat.length; x++) {
            for (int y = 0; y < mat[x].length; y++) {
                System.out.print(" "+mat[x][y]+" ");
            }
            System.out.println("");
        }

    }

    private static void printSpiralMatriz(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }
 
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
 
        while (true)
        {
            if (left > right) {
                break;
            }
 
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " -> ");
            }
            top++;
 
            if (top > bottom) {
                break;
            }
 
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " -> ");
            }
            right--;
 
            if (left > right) {
                break;
            }
 
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " -> ");
            }
            bottom--;
 
            if (top > bottom) {
                break;
            }
 
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " -> ");
            }
            left++;
        }
    }
    
}
