import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter array element: " + (i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("Min cua mang vua nhap la: " + minValue(array));
    }

    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

}