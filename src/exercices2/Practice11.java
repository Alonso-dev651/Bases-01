package exercices2;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int invertido = 0;

        System.out.println("Ingresa un numero:");
        int num = scanner.nextInt();

        while (num != 0) {
            int ult = num % 10;
            System.out.println("Ultimo digito actual: " + ult);
            invertido = invertido * 10 + ult;
            num /= 10;
            System.out.println("Numero actual: " + num);
        }

        System.out.println("El numero invertido es: " + invertido);
    }
}
