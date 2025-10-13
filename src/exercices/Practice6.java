package exercices;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

        if (edad <= 12){
            System.out.println("Estas clasificado como Infante");
        } else if (edad <=17) {
            System.out.println("Estas clasificado como Adolescente");
        } else if (edad <= 59) {
            System.out.println("Estas clasificado como Adulto");
        } else {
            System.out.println("Estas clasificado como Adulto Mayor");
        }
    }
}
