package exercices;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();

        if (num % 2 == 0) System.out.println("El numero es par");
        else System.out.println("El numero es impar");
    }
}
