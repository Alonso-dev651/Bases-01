package exercises3;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = (int) (Math.random() * 10);
        int adivina = 0;

        while (adivina != numero) {
            System.out.print("Adivina el numero secreto (0 - 10): ");
            adivina = scanner.nextInt();
            if (adivina == numero) {
                System.out.println("¡Correcto! Has adivinado el número.");
                break;
            } else System.out.println("Incorrecto");
        }
    }
}
