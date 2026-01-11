package exercises3;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Detener conteo");
        System.out.println("Conteo del 1 al 10");
        for (int i = 1; i <= 10; i++){
            if (i == 7) break;
            System.out.println(i);
        }

        System.out.println("Fin del bucle");
    }
}
