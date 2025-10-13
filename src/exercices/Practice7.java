package exercices;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la letra de calificacion: (A,B,C,D,E,F)");
        String letra = scanner.next();

        switch (letra){
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Bueno");
                break;
            case "C":
                System.out.println("Regular");
                break;
            case "D":
                System.out.println("Malo");
                break;
            case "F":
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Clasificacion no valida");
        }
    }
}
