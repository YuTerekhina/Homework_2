package Homework_2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j, String line, Throwable throwable) {
    super(String.format("Введено неверное значение '%s' в ячейке [%d][%d]", line, i, j), throwable);
   }

}
