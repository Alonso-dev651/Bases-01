package exercices2;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;

        System.out.println("Login simple");
        do {
            System.out.print("Ingrese su contraseña: ");
            pass = scanner.nextInt();
            if (pass != 1234) System.out.println("Incorrecto, intente de nuevo");
        } while (pass != 1234);

        System.out.println("Acceso concedido");
    }
}
