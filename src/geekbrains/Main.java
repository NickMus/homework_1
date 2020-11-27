package geekbrains;

<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> develop
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
<<<<<<< HEAD
        byte p = 1;
        short o = 2;
        int k = 3;
        long g = 4L;
        float f = 3.14f;
        double j = 2.71;
        char x;
        boolean h;
        String name = "Nikita";


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
        */

        guessAWord();
    }

     public static void guessTheNumber() {
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



















