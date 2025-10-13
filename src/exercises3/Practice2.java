package exercises3;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Impares del 1 al 10");

        for (int i = 1; i <= 10; i++){
            if (i %2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
