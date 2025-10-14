package exercises4;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numero");
        for (int i = 0; i <= (numeros.length - 1); i++) {
            int num = scanner.nextInt();
            numeros[i] = num;
        }

        System.out.print("Ingrese numero a buscar: ");
        int num = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i <= (numeros.length - 1); i++){
            if (numeros[i]==num) contador++;
        }

        System.out.println("El numero " + num + " aparece " + contador + " veces");
    }
}
