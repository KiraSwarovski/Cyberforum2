import java.util.Scanner;

class Test {
    public static void main (String[] args) {
        System.out.print("Сантиметры: ");
        metrix(new Scanner(System.in).nextLong());
    }

    public static void metrix (long santimeters) {
        double meters = santimeters / 100.0;
        System.out.printf("В метрах: %.2f\n", meters);
    }
}