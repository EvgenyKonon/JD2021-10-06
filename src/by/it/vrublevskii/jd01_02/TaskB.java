package by.it.vrublevskii.jd01_02;

import java.util.Scanner;

class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        step1();

        int month = sc.nextInt();
        step2(month);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        step3(a, b, c);
    }

    static void step1() {
        for (int i = 1; i <= 25; i++) {
            System.out.printf("%d ", i);
            if (i % 5 == 0) {
                System.out.print("\n");
            }
        }
    }

    static void step2(int month) {
        switch (month) {
            case 1 -> System.out.println("январь");
            case 2 -> System.out.println("февраль");
            case 3 -> System.out.println("март");
            case 4 -> System.out.println("апрель");
            case 5 -> System.out.println("май");
            case 6 -> System.out.println("июнь");
            case 7 -> System.out.println("июль");
            case 8 -> System.out.println("август");
            case 9 -> System.out.println("сентябрь");
            case 10 -> System.out.println("октябрь");
            case 11 -> System.out.println("ноябрь");
            case 12 -> System.out.println("декабрь");
            default -> System.out.println("нет такого месяца");
        }
    }

    static void step3(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("корней нет");
        } else if (d == 0) {
            c = -b / (2 * a);
            System.out.println(c);
        } else {
            c = (-b + Math.sqrt(d)) / (2 * a);
            System.out.print(c + " ");
            c = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(c);
        }
    }

}
