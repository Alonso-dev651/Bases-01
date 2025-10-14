package exercises4;

public class Practice5 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrizB = {
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] matrizsuma = new int[2][3];

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                matrizsuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("MATRIZ A:");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matrizA[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("MATRIZ B:");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matrizB[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("SUMA:");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matrizsuma[i][j]);
            }
            System.out.println(" ");
        }
    }
}
