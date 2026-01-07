package exercices;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Basica");
        System.out.println("Ingrese el primero numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese la operacion a realizar (+,-,*,/):");
        String ope = scanner.next();

        switch (ope) {
            case "+":
                System.out.println("La suma de ambos numero es: " + (num1 + num2));
                break;
            case "-":
                System.out.println("La resta de ambos numeros es: " + (num1 - num2));
                break;
            case "*":
                System.out.println("La multiplicacion de ambos numeros es: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) System.out.println("No se puede dividir entre 0");
                else System.out.println("La division de ambos numeros es: " + (num1 / num2));
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
    }
}
