package exercices2;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Invertir numero");
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        int num_invertido = 0;
        while (num > 0){
            num_invertido = (num_invertido * 10) + num % 10;
            num /= 10;
        }

        System.out.println("El numero invertido es "  + num_invertido);
    }
}
