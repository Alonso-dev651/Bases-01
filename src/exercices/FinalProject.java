package exercices;

import java.util.Scanner;

public class FinalProject {
    public static Scanner scanner = new Scanner(System.in);
    public static double saldo = 100;

    public static void main(String[] args) {

        System.out.println("""
                ---------------------------------
                Bienvenido al banco de Alonso
                ---------------------------------
                Seleccione alguna de las
                siguientes opciones:
                1. Ver saldo
                2. Depositar dinero
                3. Retirar dinero
                4. Salir
                """);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: " + saldo);
                break;
            case 2:
                System.out.println("Indique cuando dinero desea depositar");
                double incremento = scanner.nextDouble();
                saldo += incremento;
                System.out.println("Se realizo el deposito");
                System.out.println("Saldo actual: " + saldo);
                break;
            case 3:
                System.out.println("Indique cuando dinero desea retirar");
                double retiro = scanner.nextDouble();
                saldo -= retiro;
                System.out.println("Se realizo el retiro");
                System.out.println("Saldo actual: " + saldo);
                break;
            case 4:
                System.out.println("Esta saliendo del programa");
                break;
            default:
                System.out.println("No es una opcion valida");
                break;
        }
    }
}
