package exercices2;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("Numeros pares del 1 al 20");

        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) System.out.print(i + " ");
            i++;
        }
    }
}
