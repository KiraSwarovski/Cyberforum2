import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int maxValue = input;
        if (input > 0) {
            int x = 0;
            while (x < maxValue) {
                input += x;
                x++;
            }
            System.out.println(input);
        } else if (input < 0) {
            int x = 0;
            while (x > maxValue) {
                input += x;
                x--;
            }
            System.out.println(input + 1);
        } else System.out.println(input);
    }


}
