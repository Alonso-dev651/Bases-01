package exercises4;

public class Practice3 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = new int[num1.length];

        for (int i = (num1.length - 1), j = 0; i >= 0; i--, j++) {
            num2[j] = num1[i];
        }

        System.out.print("Array inverso: ");
        for (int i = 0; i <= 4; i++) {
            System.out.print(num2[i]);
        }
    }
}
