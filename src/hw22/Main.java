package hw22;




public class Main {


    public static String[][] array() throws MyArraySizeException {
        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"2", "4", "2", "3"},
                {"1", "2", "2", "2"},
                {"2", "2", "5", "2"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].length != 4 || arr[j].length != 4) {
                    throw new MyArraySizeException();
                }
            }
        }
        return arr;
    }

    public static boolean sumOfArray() throws MyArrayDataException {
        int sum = 0;
        array();
        for (int i = 0; i <array().length; i++) {
            for (int j = 0; j < array().length; j++) {
                try {
                    sum += Integer.parseInt(array()[i][j]);
                } catch (NumberFormatException e) {
                   throw  new MyArrayDataException();
                }


            }
        }
        System.out.println("Сумма элементов массива = " + sum);
        return true;
    }




        public static void main(String[] args) {
        try {
           array();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            sumOfArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
