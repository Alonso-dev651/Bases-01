package exercices2;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitos = 0;

        System.out.println("Ingrese un numero entero positivo");
        int num = scanner.nextInt();

        while (num != 0){
            num/=10;
            digitos++;
        }

        System.out.println("Tiene " + digitos + " digitos");
    }
}
