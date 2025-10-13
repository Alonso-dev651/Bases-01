package exercices2;

public class Practice10 {
    public static void main(String[] args) {
        System.out.println("Triangulo de asteriscos");

        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
