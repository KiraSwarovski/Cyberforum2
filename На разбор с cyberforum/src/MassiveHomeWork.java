import java.util.Scanner;

public class MassiveHomeWork {
    public void printMatrix(int a[][]) {
        int x = a.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int summMass(int a[][]) {
        int x = a.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += a[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + summ);
        return summ;
    }

    public void summString(int a[][]) {
        int x = a.length;
        int s = 0;
        int Str1 = 0;
        while (s < x) {
            for (int i = 0; i < x; i++) {
                Str1 += a[s][i];
            }
            s++;
            System.out.println("Сумма елементов строки " + s + " равна: " + Str1);
            Str1 = 0;
        }
    }

    public void summKolon(int a[][]) {
        int x = a.length;

        int s = 0;
        int Str1 = 0;
        while (s < x) {
            for (int i = 0; i < x; i++) {
                Str1 = Str1 + a[i][s];
            }
            s++;

            System.out.println("Сумма елементов столбца " + s + " равна: " + Str1);

            Str1 = 0;
        }
    }

    public void Perimetr(int a[][]) {
        int x = a.length;
        int y = a.length - 1;
        int s = 0;
        int Str1 = 0;
        int Str2 = 0;
        int leftUpCorner = 0;
        int rightUpCorner = 0;
        int leftDownCorner = 0;
        int rightDownCorner = 0;


        for (int i = 0; i < x; i++) {
            Str1 += a[s][i] + a[y][i];
            Str2 += a[i][s] + a[i][y];
            leftUpCorner = a[s][s];
            rightUpCorner = a[s][y];
            leftDownCorner = a[y][s];
            rightDownCorner = a[y][y];
        }


        System.out.println("Сумма верхнего и нижнего ребра равна: " + Str1);
        System.out.println("Сумма двух ребер сбоку равна: " + Str2);
        System.out.println("Сумма всех ребер равна = " + (Str2 + Str1 - leftUpCorner - rightUpCorner - leftDownCorner - rightDownCorner));

    }

    public void summDiag(int a[][]) {
        int x = a.length;
        int j = a.length - 1;
        int s = 0;
        int Str1 = 0;
        for (int i = 0; i < x; i++) {
            Str1 += a[i][i];
        }
        s++;
        System.out.println("Сумма диагонали: " + s + " равна: " + Str1);
        System.out.println("Сумма x: " + x + " равна: " + x);
        Str1 = 0;

        for (int i = 0; i < x; i++) {
            Str1 += a[i][j];
            j--;
        }
        s++;
        System.out.println("Сумма диагонали: " + s + " равна: " + Str1);
        Str1 = 0;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type array size");
        int size = scanner.nextInt();
        int arr[][] = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Type number arr [" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }

        MassiveHomeWork mhw = new MassiveHomeWork();
        mhw.printMatrix(arr);
        mhw.summMass(arr);
        mhw.summString(arr);
        mhw.summKolon(arr);
        mhw.summDiag(arr);
        mhw.Perimetr(arr);
    }
}