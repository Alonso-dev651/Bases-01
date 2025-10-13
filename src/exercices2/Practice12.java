package exercices2;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        String maybe = "";

        do {
            montrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int saldo = 1000;
                    System.out.println("Su saldo es el siguiente: " + saldo);
                    System.out.println("Desea continuar?");
                    maybe = scanner.next();
                    if (maybe.equals("n") || maybe.equals("N")) {
                        opcion = 3;
                    }
                    break;
                case 2:
                    LocalDate date = LocalDate.now();
                    System.out.println("La fecha actual es: " + date);
                    System.out.println("Desea continuar?");
                    maybe = scanner.next();
                    if (maybe.equals("n") || maybe.equals("N")) {
                        opcion = 3;
                    }
                    break;
                case 3:
                    System.out.println("Terminando operacion...");
                    break;
            }
        } while (opcion != 3);
    }

    public static void montrarMenu() {
        System.out.println("""
                --------------------------------
                MENU INTERACTIVO
                --------------------------------
                Seleccione una opcion
                1. Mostrar saludo
                2. Mostrar fecha actual
                3. Salir 
                """);
    }
}
