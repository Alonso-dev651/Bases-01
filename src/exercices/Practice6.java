package exercices;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad < 12) {
            System.out.println("Clasificado como Niño");
        } else if (edad <= 17) {
            System.out.println("Clasificado como Adolecente");
        } else if (edad <= 59) {
            System.out.println("Clasificado como Adulto");
        } else {
            System.out.println("Clasificado como Anciano");
        }
    }
}
