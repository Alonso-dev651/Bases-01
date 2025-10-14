package exercises4;

public class Practice6 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        System.out.println("Tabla generada");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matriz[i][j] = i * j;
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
