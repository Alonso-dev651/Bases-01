import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int number = scanner.nextInt();
        System.out.println("Tu numero es: " + number);
    }
}