public class Test {
    public static void main(String[] args) {
        int[][] matrixF = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[][] matrixS = {
            {2, 4, 6},
            {10, 14, 16},
            
        };

        int[][] matrixT = {
            {3, 6,},
            {15, 2},
            {3, 6,},
            {15, 2}
        };

        int[][] matrixFT = {
            {4, 8, 12},
            {20,28, 32},
            {40, 44, 48}
        };

        int[][] matrixFH = {
            {5, 10, 15, 20,2},
            {25, 30, 35, 40,3},
            {45, 50, 55, 60,5},
        };
        //declaration
        int sumF = calculateSum(matrixF);
        int sumS = calculateSum(matrixS);
        int sumT = calculateSum(matrixT);
        int sumFT = calculateSum(matrixFT);
        int sumFH = calculateSum(matrixFH);
        int totalElements = getTotalElements(matrixF, matrixFH, matrixFT, matrixS, matrixT);
        double average = (double) (sumF + sumS + sumT + sumFH + sumFT) / totalElements;

        int totalSum = sumF + sumS + sumT + sumFT + sumFH;
        // Printing the five matrices
        System.out.println("Matrix F:");
        printMatrix(matrixF);
        System.out.println();

        System.out.println("Matrix S:");
        printMatrix(matrixS);
        System.out.println();

        System.out.println("Matrix T:");
        printMatrix(matrixT);
        System.out.println();

        System.out.println("Matrix FT:");
        printMatrix(matrixFT);
        System.out.println();

        System.out.println("Matrix FH:");
        printMatrix(matrixFH);
        System.out.println();

         
        System.out.println("Sum of F:" + calculateSum(matrixF));
        System.out.println("Sum of S:" + calculateSum(matrixS));
        System.out.println("Sum of T:" + calculateSum(matrixT));
        System.out.println("Sum of FT:" + calculateSum(matrixFT));
        System.out.println("Sum of FH:" + calculateSum(matrixFH));
        System.out.println("Total sum of all arrays: " + totalSum);
        System.out.println("The average of all arrays: " + average);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int  i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

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
}
