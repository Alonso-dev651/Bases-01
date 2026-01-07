package exercices;

import java.util.Scanner;

public class MiniProyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;

        System.out.println("""
                ----------------------------
                       PROYECTO BANCO
                ----------------------------
                Ingrese la opcion a realizar:
                1. Ver saldo
                2. Depositar dinero
                3. Retirar dinero
                4. Salir
                """);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Saldo actual: " + saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dinero a depositar:");
                int deposito = scanner.nextInt();

                System.out.println("Saldo anterior: " + saldo);
                System.out.println("Saldo actual: " + (saldo + deposito));
                break;
            case 3:
                System.out.println("Ingrese la cantidad de dinero a retirar:");
                int retiro = scanner.nextInt();

                if (retiro > saldo) {
                    System.out.println("El retiro es mayor a la cantidad disponible");
                } else {
                    System.out.println("Saldo anterior: " + saldo);
                    System.out.println("Saldo actual: " + (saldo - retiro));
                }
                break;
            case 4:
                System.out.println("Saliendo del aplicativo...");
                break;
            default:
                System.out.println("No es una opcion valida");
                break;
        }
    }
}
