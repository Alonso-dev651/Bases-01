package exercises3;

public class Practice3 {
    public static void main(String[] args) {
        int num = 42;

        System.out.println("Buscando numero");
        System.out.println("Iniciando del 1 al 100 en busca del numero");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) System.out.println("Buscando...");
            if (i == num) break;
        }
        System.out.println("Encontrado!");
    }
}
