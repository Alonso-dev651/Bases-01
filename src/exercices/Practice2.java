package exercices;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nota [0-20]:");
        int nota = scanner.nextInt();

        if (nota >= 18) {
            System.out.println("Aprobado");
        } else if (nota >= 11) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
