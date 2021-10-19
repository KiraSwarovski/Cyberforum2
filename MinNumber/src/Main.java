import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
int unOrderArray[]=createArray(arraySize);
int minNumber = findMinValue(unOrderArray);
        System.out.printf("Minimum =:, %d", minNumber);

    }
    public static int[] createArray(int arr){
Scanner scanner = new Scanner(System.in);
        int[] arrayForOrder = new int [arr];
        for (int i = 0; i < arrayForOrder.length; i++) {
            arrayForOrder[i] = Integer.parseInt(scanner.nextLine());
        }
        return arrayForOrder;
    }
    public static int findMinValue(int arr[]){
        int minValue = Integer.MAX_VALUE;
        for (int value : arr) {
            if(value<minValue)minValue=value;
        }
        return minValue;
    }
}