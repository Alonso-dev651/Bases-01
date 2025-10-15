package exercises4;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[][] = new int[3][3];

        System.out.println("Ingrese 10 numero");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                int num = scanner.nextInt();
                numeros[i][j] = num;
            }
        }

        System.out.print("Numero a buscar: ");
        int num = scanner.nextInt();
        boolean seencuentra = false;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (numeros[i][j] == num) {
                    seencuentra = true;
                    break;
                }
            }
        }

        if (seencuentra) System.out.println("El numero " + num + " se encuentra en la matriz");
        else System.out.println("No se encuentra en la matriz");
    }
}
