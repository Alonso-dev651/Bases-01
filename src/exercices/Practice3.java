package exercices;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero para mostrar el dia correspondiente");
        int dia_num = scanner.nextInt();

        switch (dia_num){
            case 1:
                System.out.println("Lunes");;
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
}
