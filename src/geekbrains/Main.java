package geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        byte p = 1;
        short o = 2;
        int k = 3;
        long g = 4L;
        float f = 3.14f;
        double j = 2.71;
        char x;
        boolean h;
        String name = "Nikita";


    }


    public static float calculation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }


    public static boolean rangeCheck(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }


    public static boolean isPositiveOrNegative2() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 0) {
            return false;
        }
        else {
            return true;
        }
    }


    public static void Hello() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void isLeapOrNot() {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap");
        }
        else if (year % 400 == 0) {
            System.out.println("Leap");
        }
        else {
            System.out.println("Not leap");
        }
    }

}




