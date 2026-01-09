package exercices2;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("""
                ------------------------------------
                   BIENVENIDO AL MENU INTERACTO
                ------------------------------------
                """);
        do {
            System.out.println("""
                    SELECCIONE UNA OPCION PARA CONTINUAR
                    1. MOSTRAR SALUDO
                    2. MOSTRAR FECHA ACTUAL
                    3. SALIR
                    """);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("""
                            ------------------------------------
                               BIENVENIDO AL MENU INTERACTO
                            ------------------------------------
                            """);
                    break;
                case 2:
                    System.out.println("La fecha de hoy es: " + LocalDate.now());
                    break;
                case 3:
                    System.out.println("GRACIAS POR USAR");
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida...");
                    break;
            }
        } while (opcion != 3);
    }
}
