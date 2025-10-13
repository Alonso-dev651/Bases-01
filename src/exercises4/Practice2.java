package exercises4;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Ingrese " + numeros.length + " numeros:");
        for (int i = 0; i <= (numeros.length - 1); i++) {
            int num = scanner.nextInt();
            numeros[i] = num;
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i <= (numeros.length - 1); i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
