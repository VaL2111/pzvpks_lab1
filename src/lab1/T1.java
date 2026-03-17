package lab1;

public class T1 extends Thread {

    public T1(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Потік T1 стартував.");

        // Введення даних
        int[] A = Data.vectorInput("A");
        int[] B = Data.vectorInput("B");
        int[][] MA = Data.matrixInput("MA");
        int[][] MC = Data.matrixInput("MC");
        int e = Data.scalarInput("e");

        // Обчислення F1: C = A - B * (MA * MC) * e

        // Дія 1: MM = MA * MC
        int[][] MM = Data.matrixMultiply(MA, MC);

        // Дія 2: V_temp = B * MM
        int[] V_temp = Data.vectorMatrixMultiply(B, MM);

        // Дія 3: V_temp2 = V_temp * e
        int[] V_temp2 = Data.vectorScalarMultiply(V_temp, e);

        // Дія 4: C = A - V_temp2
        int[] C = Data.vectorSubtract(A, V_temp2);

        // Виведення результату
        Data.printVector("F1 result C", C);
        System.out.println("Потік T1 завершив роботу.");
    }
}