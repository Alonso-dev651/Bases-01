package exercices;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primero numero:");
        int pri_num = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int seg_num = scanner.nextInt();
        System.out.println("Ingrese la operacion (+,-,*,/)");
        String ope = scanner.next();

        switch (ope) {
            case "+":
                System.out.println("La suma de los numeros es: " + (pri_num + seg_num));
                break;
            case "-":
                System.out.println("La resta de los numeros es: " + (pri_num - seg_num));
                break;
            case "*":
                System.out.println("La multiplicacion de los numeros es: " + (pri_num * seg_num));
                break;
            case "/":
                if (seg_num != 0) {
                    System.out.println("La division de los numero es: " + ( (double) pri_num/seg_num));
                }else {
                    System.out.println("El segundo numero debe ser diferente de cero");
                }
                break;
            default:
                System.out.println("Operacion no disponible");
                break;
        }
    }
}
