package exercices2;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TABLA DE MULTIPLICAR");
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 12; i ++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
