package les1;

import java.util.Scanner;

public class matrix {
    public static Scanner scanner = new Scanner(System.in);
    public static int a = scanner.nextInt();
    public static int b = scanner.nextInt();
    public static int c = scanner.nextInt();
    public static int d = 0;
    public static int[][] arr = new int[a][b];

    public static void main(String[] args) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int max = 10;
                int min = -10;
                int x = (int) (Math.random() * ++min) + max;

                arr[i][j] = x;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\t");
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (c >= arr[i][j]){
                    d = d + 1;
                }
            }
            System.out.println("свётчик" + d);
            d = 0;
        }
    }
}
