package hometask5;

public class MultiArray2 {
    public static void main (String[] args) {
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = j + 1;
            }
        }
        for (int[] array : matrix1) {
            for (int array4 : array) {
                System.out.print(array4 + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][][] matrix2 = {{{1, 0, 3}, {1, 0, 3}, {1, 0, 3}}, {{1, 0, 3}, {1, 0, 3}, {1, 0, 3}}, {{1, 0, 3}, {1, 0, 3}, {1, 0, 3}}};

        for (int[][] array : matrix2) {
            for (int[] array2 : array) {
                for (int array3 : array2) {
                    System.out.print(array3 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}

