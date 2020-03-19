package hometask5;

public class MultiArray1 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}}; // 3 строки 012; 3 колонки 012

        System.out.println(matrix[1][1]);

        for (int i=0; i<matrix.length; i++){ // проходится по строкам
            for (int j=0; j<matrix[i].length; j++){ //проходится по каждому элементу строки
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
