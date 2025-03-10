
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

        public static void task1() {
            System.out.println("task_1");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть довжину першої основи трапеції:");
            double base1 = scanner.nextDouble();

            System.out.println("Введіть довжину другої основи трапеції:");
            double base2 = scanner.nextDouble();

            System.out.println("Введіть висоту трапеції:");
            double height = scanner.nextDouble();

            double area = calculateTrapezoidArea(base1, base2, height);

            System.out.println("Площа трапеції: " + area);

            scanner.close();
        }
    public static double calculateTrapezoidArea(double base1, double base2, double height) {

        double area = ((base1 + base2) * height) / 2;
        return area;
    }



    public static double area_of_square(double r, double p) {
        return 2.0 * r * p;
    }

    public static void task2() {
        System.out.println("task_2");
        int num1 = 9;
        int num2 = 12;
        int num3 = 6;
        int min = findMin(num1, num2, num3);
        System.out.println("Найменше число: " + min);
    }

    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void task3() {
        int[] arry = new int[]{10, 100, 35, -19, 195};
        System.out.println("task_3");
        System.out.print("Числа з масиву:");
        printarr(arry);
    }

    public static void printarr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    public static void task4() {
        int[] array = new int[]{10, 100, 35, -19, 195};
        System.out.println(" ");
        System.out.println("task_4");
        int maxNumber = findMax(array);
        System.out.println("Найбільше число в масиві: " + maxNumber);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
