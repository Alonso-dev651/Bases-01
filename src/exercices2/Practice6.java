package exercices2;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;

        do {
            System.out.print("Ingrese la contraseña: ");
            pass = scanner.nextInt();
            if (pass != 1234) {
                System.out.println("Incorrecta, intente nuevamente");
            }
        } while (pass != 1234);
        System.out.println("Acceso Concedido");
    }
}
