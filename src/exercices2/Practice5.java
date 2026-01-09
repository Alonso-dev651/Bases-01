package exercices2;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int condicion = 1;

        System.out.println("Contador");
        while (condicion != 0) {
            System.out.print("Ingrese su numero: ");
            condicion = scanner.nextInt();
            contador++;
        }

        System.out.println("Ingresaste " + (contador - 1) + " numeros");
    }
}
