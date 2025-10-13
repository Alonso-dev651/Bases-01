package exercises3;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Buscando un numero");
        int i = 0;

        for (i = 0; i <= 100; i++){
            if (i % 10 == 0){
                System.out.println("Buscando...");
            }
            if (i == 42){
                break;
            }
        }

        System.out.println("Numero encontrado, numero: " + i);
    }
}
