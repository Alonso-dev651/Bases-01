package exercises3;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Conteo interrumpido");

        for (int i = 0; i<= 10; i++){
            if (i == 7){
                System.out.println("Se interrumple bucle");
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fin del bucle");
    }
}
