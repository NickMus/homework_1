package geekbrains;

import java.util.Arrays;
>>>>>>> develop
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


=======



   /* public static void hello() {
        System.out.println("hello");
>>>>>>> develop
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


        public static boolean sum() {
            boolean b = false;
            int sum1 = 0;
            int sum2 = 0;
            int[] arr = {1, 2, 5, 9, 4, 13};
            for (int j = 0; j < arr.length; j++) {
                for (int i = 0; i <= j; i++) {
                    sum1 = sum1 + arr[i];
                }
                for (int i = j + 1; i < arr.length; i++) {
                    sum2 = sum2 + arr[i];
                }
                if (sum1 == sum2) {
                    b=true;
                    break;}

                sum1 = 0;
                sum2 = 0;
            }

            return b;
        }


    }
    public static void MoveMassive(int numb) {
        int i , j;
        if (numb > 0) {

            numb = 2;
            int[] arr = {1, 2, 3, 4, 5, 6};
            for (i = 0; i < numb; i++) {
                int a = arr[arr.length - 1];
                for (j = arr.length - 1; j >= 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = a;
            }
            System.out.println(Arrays.toString(arr));
        } else {

            numb = -3;
            int plus = numb * (-1);
            int[] arr = {1, 2, 3, 4, 5, 6};
            for (i = 0; i < plus; i++) {
                int a = arr[0];
                for (j = 0; j <= arr.length - 2; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = a;
            }
            System.out.println(Arrays.toString(arr));
        }
        */

    }

    /* public static void guessTheNumber() {
        byte a = (byte) (Math.random() * 9);
        System.out.println("Угадай число от 0 до 9");
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            byte b = sc.nextByte();
            if (b < a) {
                System.out.println("Загаданное число больше");
            } else if (b > a) {
                System.out.println("Загаданное число меньше");
            }
            else {
                System.out.println("Вы угадали");
                break;
            }
        }
        System.out.println("GAME OVER");
        restart();

    }
    public static void restart() {
        System.out.println("Хотите повторить игру?  1 - да.  0 - нет");
        Scanner sc = new Scanner(System.in);
        byte d = sc.nextByte();
        if (d == 1) {
            guessTheNumber();
        }
        else {
            System.out.println("GAME OVER");
        }

    }


    public static void guessAWord() {
        int length;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};


             length =  words.length; //длинна массива

             int a = (int) (Math.random() * length); //загадываем число
        String word = words[a]; //загаданное слово = слову из номера ячейки массива
        char[] gameVariant = word.toCharArray(); //загаданное слово в массив символов
        System.out.println("Я загадал слово.Угадайте его");
        for (int i = 0; ; i++) {
            Scanner sc = new Scanner(System.in);
          String playerWord = sc.nextLine();
          char[] playerVariant = playerWord.toCharArray(); //введенное слово в массив символов


            char[] mask = new char[gameVariant.length];
            for (int j = 0; j < gameVariant.length; j++) {
                mask[j] = '#';
            }

            for (int j = 0; j < gameVariant.length; j++) {
                 for (int k = 0; k < playerVariant.length; k++) {

                    if (gameVariant[j] == playerVariant[k]) {
                        mask[j] = gameVariant[j];
                    }


                 }

            }


            if  (Arrays.equals(gameVariant, playerVariant)) {
                System.out.println("Вы угадали");
                break;
            }
            else {
                System.out.println("Вы не угадали. Игра продолжается");
                System.out.println(mask);


            }

        }

    }
}



















