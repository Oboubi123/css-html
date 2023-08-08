public class JavaMidsem {
    public static void main(String[] args){
        int[][] F = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int[][] S = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Third Array (4 rows x 2 columns)
        int[][] T = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] FH = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Fifth Array (3 rows x 5 columns)
        int[][] FT = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        int sumF = calculateSum(F);
        int sumS = calculateSum(S);
        int sumT = calculateSum(T);
        int sumFT = calculateSum(FT);
        int sumFH = calculateSum(FH);
        int totalElements = getTotalElements(F, FH, FT, S, T);
        double average = (double) (sumF + sumS + sumT + sumFH + sumFT) / totalElements;

        int totalSum = sumF + sumS + sumT + sumFT + sumFH;
       
        System.out.println("Sum of F:" + calculateSum(F));
        System.out.println("Sum of S:" + calculateSum(S));
        System.out.println("Sum of T:" + calculateSum(T));
        System.out.println("Sum of FT:" + calculateSum(FT));
        System.out.println("Sum of FH:" + calculateSum(FH));
        System.out.println("Total sum of all arrays: " + totalSum);
        System.out.println("The average of all arrays: " + average);
    }
    
    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
    public static int getTotalElements(int[][]... arrays ) {
        int totalElements = 0;
        for (int[][] array : arrays) {
            totalElements += array.length * array[0].length;
        }
        return totalElements;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
