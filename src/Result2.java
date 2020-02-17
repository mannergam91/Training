
import java.util.Scanner;

public class  Result2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Наполните массив длинною " + size + ":");
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();
        sort(arr, size);
        for (int i : arr)
            System.out.print(i + " ");
    }

    private static void sort(int[] arr, int size) {
        for (int min, temp, index = 0; index < size - 1; index++) {
            min = index;
            for (int count = index + 1; count < size; count++)
                if (arr[count] < arr[min])
                    min = count;
            temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }
    }
}