package exercises3;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("Numeros excepto multiplos de 3");

        for (int i = 1; i <= 15; i++){
            if (i % 3==0) continue;
            System.out.println(i);
        }
    }
}
