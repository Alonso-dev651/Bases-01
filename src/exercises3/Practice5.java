package exercises3;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_secret, num = 0;
        num_secret = (int) (Math.random()*10 + 1);

        System.out.print("Adivina el numero (entre 1 y 10): ");
        num = scanner.nextInt();

        while (num != num_secret){
            System.out.println("Numero incorrecto");
            System.out.print("Adivina el numero (entre 1 y 10): ");
            num = scanner.nextInt();
            if (num == num_secret)break;
        }

        System.out.println("Has adivinado el numero, felicidades!!!");
    }
}
