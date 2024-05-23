import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4_1();
        task4_2();

    }
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("a=");
        int a = scan.nextInt();
        System.out.printf("b=");
        int b = scan.nextInt();
        System.out.printf("c=");
        int c = scan.nextInt();

        double x1, x2, D, KorD;
        D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Розвязків немає");
        } else {
            KorD = Math.sqrt(D);
            x1 = (-b + D) / a;
            x2 = (-b - D) / a;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть координату x: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть координату y: ");
        double y = scanner.nextDouble();

        int quadrant;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0; // якщо точка знаходиться на одній з координатних вісей або у початковій точці
        }
        if (quadrant != 0) {
            System.out.println("Точка знаходиться в квадранті " + quadrant);
        } else {
            System.out.println("Точка знаходиться на одній з координатних вісей або у початковій точці");
        }
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) { // Перевірка, чи є число двозначним
            if (number % 2 == 0) { // Перевірка, чи є число парним
                System.out.println("Число " + number + " є двозначним і парним.");
            } else {
                System.out.println("Число " + number + " є двозначним, але не парним.");
            }
        } else {
            System.out.println("Число не є двозначним.");
        }
    }
    public static void task4_1() {
        double x = 1.5;
        double f;
        if (x <= -2.5) {
            f = Math.exp(-x);
        } else if (x > -2.5 && x <= 0) {
            f = Math.pow((2 + x) / (3 - Math.pow(x, 2)), 1.0 / 3.0);
        } else {
            f = Math.exp(Math.sin(x) - Math.cos(Math.pow(x, 2)));
        }

        System.out.println("f(x) = " + f);
    }

    public static void task4_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер дня від 1 до 5: ");
        int num_day = scanner.nextInt();
        System.out.print("Введіть номер пари від 1 до 4: ");
        int num_couple = scanner.nextInt();
        if (num_day == 1) {
            if (num_couple == 1) {
                System.out.println("3пара - Філософія (лекція)");
            }
            else if (num_couple == 2) {
                System.out.println("4 пара - Програмно-апаратні засоби в телекомунікаціях та радіотехніці (лекція)");
            }
            else if (num_couple == 3) {
                System.out.println("5 пара - Об`єктно-орієнтоване програмування, частина 1 (лабораторна)");
            }
            else if (num_couple == 4) {
                System.out.println("6 пара -Об`єктно-орієнтоване програмування, частина 1 (лабораторна)");
            }

            else {
                System.out.println("не коректне число");
            }
        }

        else if (num_day == 2) {
            if (num_couple == 1) {
                System.out.println("1 пара -Передавання сигналів в інформаційних системах (лекція)");
            }
            else if (num_couple == 2) {
                System.out.println("2 пара - Електродинаміка та поширення радіохвиль (лекція)");
            }
            else if (num_couple == 3) {
                System.out.println("3 пара - Програмно-апаратні засоби в телекомунікаціях та радіотехніці (лабораторна)");
            }
            else if (num_couple == 4) {
                System.out.println("4 пари немає");
            }
            else {
                System.out.println("не коректне число");
            }
        }
        else if (num_day == 3) {
            if (num_couple == 1) {
                System.out.println("4 пара - Цифрова схемотехніка (лекція)");
            }
            else if (num_couple == 2) {
                System.out.println("5 пара - Цифрова схемотехніка (лабораторна) ");
            }
            else if (num_couple == 3) {
                System.out.println("6 пари немаж");
            }
            else if (num_couple == 4) {
                System.out.println("7 пари немає ");
            }
            else {
                System.out.println("не коректне число");
            }
        }
        else if (num_day == 4) {
            if (num_couple == 1) {
                System.out.println("3 пара - Передавання сигналів в інформаційних системах (лабораторна) ");
            }
            else if (num_couple == 2) {
                System.out.println("4 пара - Передавання сигналів в інформаційних системах (практична)");
            }
            else if (num_couple == 3) {
                System.out.println("5 пари немає");
            }
            else if (num_couple == 4) {
                System.out.println("6 пари немає");
            }
            else {
                System.out.println("не коректне число");
            }
        }
        else if (num_day == 5) {
            if (num_couple == 1) {
                System.out.println("1 пара - Об`єктно-орієнтоване програмування, частина 1 (лекція)");
            }
            else if (num_couple == 2) {
                System.out.println("2 пара - Цифрова схемотехніка (лабораторна) ");
            }
            else if (num_couple == 3) {
                System.out.println("3 пари немає ");
            }
            else if (num_couple == 4) {
                System.out.println("4 пари немає");
            }
            else{
                System.out.println("не коректне число");
            }
        }
        else {
            System.out.println("не коректне число");
        }
    }
}
