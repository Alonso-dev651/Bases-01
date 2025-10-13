package exercices2;

import java.util.Scanner;

public class Practice5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 1;
        int contador = 0;

        while (num != 0){
            System.out.print("Ingrese un numero:");
            num = scanner.nextInt();
            contador++;
        }

        System.out.println("Ingresaste " + contador + " numeros");
    }
}
