package exercices2;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("Suma de numero por separados");
        int sum_par = 0;
        int sum_impar = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0){
                sum_par+=i;
            }else{
                sum_impar+=i;
            }
        }
        System.out.println("Suma pares: " + sum_par);
        System.out.println("Suma impares: " + sum_impar);
    }
}
