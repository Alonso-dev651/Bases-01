package exercices;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la letra de su nota [A,B,C,D,F]");
        String nota = scanner.next();

        switch (nota.toUpperCase()) {
            case "A":
                System.out.println("Su nota es Excelente");
                break;
            case "B":
                System.out.println("Su nota es Bueno");
                break;
            case "C":
                System.out.println("Su nota es Regular");
                break;
            case "D":
                System.out.println("Su nota es Malo");
                break;
            case "F":
                System.out.println("Su nota es Reprobado");
                break;
            default:
                System.out.println("Letra no valida");
                break;
        }
    }
}
