package exercises4;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[][] = new int[3][3];

        System.out.println("Ingrese 9 numeros: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                int num = scanner.nextInt();
                numeros[i][j] = num;
            }
        }

        System.out.println("Suma por filas");
        for (int i = 0; i <= 2; i++) {
            int num = 0;
            for (int j = 0; j <= 2; j++) {
                int temp = numeros[i][j];
                num += temp;
            }
            System.out.println("Fila " + (i + 1) + ": " + num);
        }

        System.out.println("Suma por columnas");
        for (int i = 0; i <= 2; i++) {
            int num = 0;
            for (int j = 0; j <= 2; j++) {
                int temp = numeros[j][i];
                num += temp;
            }
            System.out.println("Columna " + (i + 1) + ": " + num);
        }
    }
}
