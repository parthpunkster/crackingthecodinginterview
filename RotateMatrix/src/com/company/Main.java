package com.company;

public class Main {

    public static boolean rotate(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length ) {
            return false;
        }
        int n = matrix.length;
        for (int i = 0; i< n/2; i++) {
            int first = i;
            int last = n - 1 - i;
            for (int j = first;j < last; j++) {
                int offset = j - first;
                int top = matrix[first][j];
                matrix[first][j] = matrix[last-offset][first]; // left -> top
                matrix[last-offset][first] = matrix[last][last-offset]; // bottom -> left
                matrix[last][last-offset] = matrix[j][last]; // right -> bottom
                matrix[j][last] = top; // top -> right
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] m = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(rotate(matrix));
    }
}
