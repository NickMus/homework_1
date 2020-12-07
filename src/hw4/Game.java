package hw4;


import java.util.Random;
import java.util.Scanner;
    public class Game {
        public static int SIZE = 5;
        public static int DOTS_TO_WIN = 4;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();


        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }


                if (blockHuman()) {
                    blockHuman();
                } else {
                    aiTurn();
                }


                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static boolean checkWin(char symb) {
//            if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//            if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;


            int t = SIZE - DOTS_TO_WIN;
            for (int n = 0; n <= t; n++) {
                for (int m = 0; m <= t; m++) {

                    for (int i = n; i < DOTS_TO_WIN + n; i++) {
                        int b = 0;
                        for (int j = m; j < DOTS_TO_WIN + m; j++) {
                            if (map[i][j] == symb) {
                                b++;
                                if (b == DOTS_TO_WIN)
                                    return true;
                            } else {
                                b = 0;
                            }
                        }
                    }


                    for (int k = n; k < DOTS_TO_WIN + n; k++) {
                        int c = 0;
                        for (int l = m; l < DOTS_TO_WIN + m; l++) {
                            if (map[l][k] == symb) {
                                c++;
                                if (c == DOTS_TO_WIN)
                                    return true;
                            } else {
                                c = 0;
                            }
                        }
                    }


                    int d = 0;
                    for (int i = n; i < DOTS_TO_WIN + n; i++) {

                        if (map[i][m + n + (DOTS_TO_WIN - 1) - i] == symb) {
                            d++;
                            if (d == DOTS_TO_WIN)
                                return true;
                        } else {
                            d = 0;
                        }
                    }


                    int q = 0;
                    for (int o = n; o < DOTS_TO_WIN + n; o++) {
                        if (map[o][o - n + m] == symb) {
                                q++;
                                if (q == DOTS_TO_WIN)
                                    return true;
                            } else {
                                q = 0;
                            }
                        }
                    }
                }


            return false;
        }


        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            return map[y][x] == DOT_EMPTY;
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static boolean blockHuman() {
            int e = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        map[i][j] = DOT_X;
                        checkWin(DOT_X);
                        if (checkWin(DOT_X)) {
                            map[i][j] = DOT_O;
                            e++;
                        } else {
                            map[i][j] = DOT_EMPTY;
                        }

                    }
                }
            }

                return e > 0;

            }

        }













