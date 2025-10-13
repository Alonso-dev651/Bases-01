package exercices;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nota para saber tu estado:");
        int nota = scanner.nextInt();
        if (nota >= 18){
            System.out.println("Tu estado es Excelente");
        } else if (nota >= 11) {
            System.out.println("Tu estado es Aprobado");
        }else {
            System.out.println("Tu estado es Desaprobado");
        }
    }
}
