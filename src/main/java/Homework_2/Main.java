package Homework_2;

public class Main {
    private static int SIZE = 4;

    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "^", "4"},
        };
        System.out.print("Проверка первого массива:  ");
        try {
            System.out.println("Сумма первого массива равна: " + arrSum(array1));
        } catch (MyArrayDataException | MyArraySizeException a) {
            System.out.println(a);
        }
        System.out.print("Проверка второго массива:  ");
        try {
            System.out.println("Сумма второго массива равна: " + arrSum(array2));
        } catch (MyArrayDataException | MyArraySizeException a) {
            System.out.println(a);
        }
        System.out.print("Проверка третьего массива:  ");
        try {
            System.out.println("Сумма третьего массива равна: " + arrSum(array3));
        } catch (MyArrayDataException | MyArraySizeException a) {
            System.out.println(a);
        }
    }

    private static int arrSum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (array.length != SIZE){
        throw new MyArraySizeException();
        }

        for (int i =0; i < array.length; i++){
            if(array[i].length != SIZE){
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
               try {
                   sum += Integer.parseInt(array[i][j]);
               } catch (NumberFormatException exception) {
                   throw new MyArrayDataException(i, j, array[i][j], exception);
               }
            }
        }
        return sum;
    }


}
