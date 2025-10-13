package exercises4;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("Ingrese las notas de su curso:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nota " + i + ": ");
            double nota_actual = scanner.nextDouble();
            notas[(i - 1)] = nota_actual;
        }

        double promedio = 0;
        for (int i = 0; i <= 4; i++) {
            promedio+=notas[i];
        }
        promedio = promedio / notas.length;

        System.out.println("El promedio del curso es: " + promedio);
    }
}
