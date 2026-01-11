package exercises3;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("Saltar multiplos de 3");
        System.out.println("Lista del 1 al 15");
        for (int i = 1; i <= 15; i++){
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
