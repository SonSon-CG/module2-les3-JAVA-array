import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("Nhap so ban muon kiem tra: ");
        int x = sc.nextInt();

        if (findIndex(arr, x) == Integer.MAX_VALUE){
            System.out.println( x + "khong co trong mang");
        }else{
            System.out.println(x + " co trong mang, o vi tri: " + findIndex(arr, x) + ", ban co muon xoa " + x + " khong?");
            System.out.println("1: CO ");
            System.out.println("2: KHONG ");
        }

        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    remove(arr, x);
                    System.out.println("Mang sau khi xoa la:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + "\t");
                    }

                    break;

                case 2:
                    System.exit(0);
            }
        }while (choice != 1 || choice != 2);
    }

    public static int findIndex(int[] array, int number) {
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static int[] remove(int[] array, int number) {
        int index = findIndex(array, number);
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

}