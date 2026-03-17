package lab1;

public class T3 extends Thread {

    public T3(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Потік T3 стартував.");

        // Введення даних
        int[][] MP = Data.matrixInput("MP");
        int[][] MR = Data.matrixInput("MR");
        int[] S = Data.vectorInput("S");

        // Обчислення F3: O = SORT(MP * MR) * S

        // Дія 1: H = MP * MR
        int[][] H = Data.matrixMultiply(MP, MR);

        // Дія 2: Сортування рядків матриці
        int[][] H_sorted = Data.sortMatrixRows(H);

        // Дія 3: Множення матриці на вектор
        int[] O = Data.matrixVectorMultiply(H_sorted, S);

        // Виведення результату
        Data.printVector("F3 result O", O);
        System.out.println("Потік T3 завершив роботу.");
    }
}