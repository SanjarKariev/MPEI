import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи колличество строк в матрице: ");

        int rows = sc.nextInt();
        System.out.print("Введи коллическо колонок в матрице: ");

        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Введи элементы матрицы:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Введи минимальное значение: ");
        int val = sc.nextInt();

        for (int j = 0; j < cols; j++) {
            int count = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] < val) {
                    count++;
                }
            }
            System.out.println("Колонка " + j + ": " + count);
        }
    }
}