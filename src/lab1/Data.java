package lab1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Data {
    public static final int N = 3;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static int[] vectorInput(String name) {
        int[] v = new int[N];
        if (N <= 3) {
            System.out.println("Введіть елементи вектора " + name + " (" + N + " шт.):");
            for (int i = 0; i < N; i++) {
                v[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < N; i++) {
                v[i] = random.nextInt(10);
            }
        }
        return v;
    }

    public static int[][] matrixInput(String name) {
        int[][] m = new int[N][N];
        if (N <= 3) {
            System.out.println("Введіть елементи матриці " + name + " (рядками):");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    m[i][j] = scanner.nextInt();
                }
            }
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    m[i][j] = random.nextInt(10);
                }
            }
        }
        return m;
    }

    public static void printVector(String name, int[] v) {
        if (N <= 10) {
            System.out.println("Vector " + name + ": " + Arrays.toString(v));
        }
    }

    public static void printMatrix(String name, int[][] m) {
        if (N <= 10) {
            System.out.println("Matrix " + name + ":");
            for (int[] row : m) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    public static int[][] matrixMultiply(int[][] m1, int[][] m2) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static int[] vectorMatrixMultiply(int[] v, int[][] m) {
        int[] result = new int[N];
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                result[j] += v[i] * m[i][j];
            }
        }
        return result;
    }

    public static int[] matrixVectorMultiply(int[][] m, int[] v) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += m[i][j] * v[j];
            }
        }
        return result;
    }

    public static int[] vectorScalarMultiply(int[] v, int scalar) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = v[i] * scalar;
        }
        return result;
    }

    public static int[][] matrixScalarMultiply(int[][] m, int scalar) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = m[i][j] * scalar;
            }
        }
        return result;
    }

    public static int[] vectorSubtract(int[] v1, int[] v2) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = v1[i] - v2[i];
        }
        return result;
    }

    public static int maxMatrix(int[][] m) {
        int max = m[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (m[i][j] > max) max = m[i][j];
            }
        }
        return max;
    }

    public static int[][] sortMatrixRows(int[][] m) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            System.arraycopy(m[i], 0, result[i], 0, N);
            Arrays.sort(result[i]);
        }
        return result;
    }
}