package geekbrains;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here



   /* public static void hello() {
        System.out.println("hello");
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        int j;
        int c;
        int b;



        int[] arr = {0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0};
        for (int i = 0;i <arr.length; i++) {
            System.out.println(i);
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));


        int[] arr = new int [8];
        for (i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));


        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));


        int[][] arr = new int [6][6];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (i + j == 5 || i == j) {
                    arr[i][j] = 1;
                }System.out.print(arr[i][j] + " ");
            }
            System.out.println();



            int[] arr = {8, 5, 9, 2, 7};
            c = arr[0];
            b = arr[0];
            for (i = 0; i < arr.length; i++) {
                if (c > arr[i]) {
                    c = arr[i];
                }
                if (b < arr[i]) {
                    b = arr[i];
                }
            }
            System.out.println(c);
            System.out.println(b);


            System.out.println(sum());
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

        guessAWord();
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

    } */


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



















