package exercices2;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de digitos");
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        int digitos = 0;
        while (num > 0){
            num = num / 10;
            digitos++;
        }

        System.out.println("Tiene " + digitos + " digitos");
    }
}
