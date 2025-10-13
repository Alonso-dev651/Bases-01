package exercises3;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 100;

        do {
            mostrarMenu();
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    int num_ran = (int) (Math.random()*10 + 1);
                    System.out.println("Numero random: " + num_ran);
                    break;
                case 3:
                    System.out.println("Terminando operacion...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            if (opcion == 3) break;
        }while (true);
    }

    public static void mostrarMenu(){
        System.out.println("""
                Menu
                1. Mostrar saldo
                2. Mostrar numero aleatorio
                3. Salir
                """);
    }
}
