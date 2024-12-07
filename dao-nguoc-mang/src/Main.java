import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements in array: ");
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();

        int[] array2 = new int[size];

        for (int i = 0; i < size; i++) {
            array2[i] = array[size - 1 - i];
        }
        System.out.println("Reverse array: ");
        for (int i : array2) {
            System.out.print(i + "\t");
        }
    }
}