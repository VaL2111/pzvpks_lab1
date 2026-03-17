// Лабораторна робота ЛР1 Варіант 1.3 2.4 3.5
// F1: C = A - B * (MA * MC) * e
// F2: MG = MAX(MH) * (MK * ML)
// F3: O = SORT(MP * MR) * S
// Бахмацький В. ІМ-31
// Дата 18.02.2026

package lab1;

public class Main {
    public static void main(String[] args) {
        // Фіксація часу початку роботи
        long startTime = System.currentTimeMillis();

        // Створення потоків з різними пріоритетами
        // T1 - MIN (1), T2 - NORM (5), T3 - MAX (10)
        T1 t1 = new T1("Thread-1", Thread.MIN_PRIORITY);
        T2 t2 = new T2("Thread-2", Thread.NORM_PRIORITY);
        T3 t3 = new T3("Thread-3", Thread.MAX_PRIORITY);

        // Запуск потоків
        t1.start();
        t2.start();
        t3.start();

        // Очікування завершення потоків
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Фіксація часу завершення
        long endTime = System.currentTimeMillis();
        System.out.println("Програма завершена за " + (endTime - startTime) + " мс");
    }
}