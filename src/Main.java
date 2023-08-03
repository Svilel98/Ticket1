import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void reverseArray(int[] array) {
        int[] array2 = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] array = {1, 4, 5, 6, 7, 8};
        reverseArray(array);
    }

}