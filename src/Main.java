import lab1.Data;

public class Main {
    public static void main(String[] args) {
        System.out.println("Розмірність N = " + Data.N);

        int[] A = Data.vectorInput("Vector A");
        int[] B = Data.vectorInput("Vector B");
        int[][] MA = Data.matrixInput("Matrix MA");
        int[][] MB = Data.matrixInput("Matrix MB");

        Data.printVector("A", A);
        Data.printVector("B", B);
        Data.printMatrix("MA", MA);

        System.out.println("Test: MA * MB");
        int[][] MxM = Data.matrixMultiply(MA, MB);
        Data.printMatrix("Result MxM", MxM);

        System.out.println("Test: Vector A * Matrix MA");
        int[] VxM = Data.vectorMatrixMultiply(A, MA);
        Data.printVector("Result VxM", VxM);

        int scalar = 2;

        System.out.println("Test: Vector A * " + scalar);
        int[] V_Mul_Scalar = Data.vectorScalarMultiply(A, scalar);
        Data.printVector("Result A*2", V_Mul_Scalar);

        System.out.println("Test: Matrix MA * " + scalar);
        int[][] M_Mul_Scalar = Data.matrixScalarMultiply(MA, scalar);
        Data.printMatrix("Result MA*2", M_Mul_Scalar);

        System.out.println("Test: Vector A - Vector B");
        int[] V_Sub = Data.vectorSubtract(A, B);
        Data.printVector("Result A-B", V_Sub);

        System.out.println("Test: Max in MA: " + Data.maxMatrix(MA));

        System.out.println("Test: Sorting MA rows");
        int[][] SortedMA = Data.sortMatrixRows(MA);
        Data.printMatrix("Sorted MA", SortedMA);
    }
}