package hw22;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException() {
        System.out.println("Недопустимый размер массива");
    }
}
