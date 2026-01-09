package exercices2;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("Numeros pares del 1 al 20");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 20) System.out.print(i);
                else System.out.print(i + " ");
            }
        }
    }
}
