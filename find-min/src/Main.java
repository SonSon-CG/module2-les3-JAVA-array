import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements:");
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        array[3] = scanner.nextInt();
        array[4] = scanner.nextInt();
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}