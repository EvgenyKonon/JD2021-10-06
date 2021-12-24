package SchildtTest.GalToLit;

public class FIndNumbers {
    // Нахождение простых чисел в диапазоне от 2 до 100

    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for (i = 2; i < 100; i++) {
            isprime = true;
            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) isprime = false;
            if (isprime) {
                System.out.println(i + " - простое число.");
            }
        }
    }
}