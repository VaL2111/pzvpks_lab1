package lab1;

public class T2 extends Thread {

    public T2(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Потік T2 стартував.");

        // Введення даних
        int[][] MH = Data.matrixInput("MH");
        int[][] MK = Data.matrixInput("MK");
        int[][] ML = Data.matrixInput("ML");

        // Обчислення F2: MG = MAX(MH) * (MK * ML)

        // Дія 1: Обчислюємо MK * ML
        int[][] MkMl = Data.matrixMultiply(MK, ML);

        // Дія 2: Знаходимо максимальний елемент у матриці MH
        int maxMh = Data.maxMatrix(MH);

        // Дія 3: MG = (MkMl) * maxMh
        int[][] MG = Data.matrixScalarMultiply(MkMl, maxMh);

        // Виведення результату
        Data.printMatrix("F2 result MG", MG);
        System.out.println("Потік T2 завершив роботу.");
    }
}