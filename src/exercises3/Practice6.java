package exercises3;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("""
                ----------------------------------
                           BIENVENIDO AL
                         MENU INTERACTIVO
                ----------------------------------
                """);

        menu:
        do {
            System.out.println("""
                    SELECCIONE UNA OPCION PARA CONTINUAR
                    1. Mostrar saludo
                    2. Mostrar numero aleatorio
                    3. Salir
                    """);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("""
                            ----------------------------------
                                       BIENVENIDO AL
                                     MENU INTERACTIVO
                            ----------------------------------
                            """);
                    break;
                case 2:
                    int numero = (int) (Math.random() * 10);
                    System.out.println("Numero aleatorio: " + numero);
                    break;
                case 3:
                    System.out.println("Gracias por usar el menu, hasta la proxima...");
                    break menu;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }
}
