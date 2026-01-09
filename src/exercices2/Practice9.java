package exercices2;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("SUMA DE NUMEROS IMPARES Y PARES ENTRE EL 1 Y 20");

        int sumapar = 0, sumaimpar = 0;
        for (int i = 1; i <= 20; i ++){
            if (i % 2 == 0) sumapar+=i;
            else sumaimpar+=i;
        }

        System.out.println("Suma de pares: " + sumapar);
        System.out.println("Suma de impares: " + sumaimpar);
    }
}
