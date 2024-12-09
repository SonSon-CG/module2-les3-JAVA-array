import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("nhap phan tu " + (i+1));
            array1[i] = sc.nextInt();
        }
        System.out.println("nhap so can chen");
        int x = sc.nextInt();

        System.out.println("nhap index muon chen");
        int index = sc.nextInt();
        if (index < -1 || index > array1.length){
            System.out.println(" Khong nhap dc ");
        }else{
            int[] array2 = add(x, index, array1);
            for (int i = 0; i < array2.length; i++) {
                System.out.println(array2[i]);
            }
        }


    }
    public static int[] add(int a, int index , int[] array) {
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            array2[i] = array[i];
        }
        array2[index] = a;
        for (int i = (index); i < array.length; i++) {
            array2[i+1] = array[i];
        }
        return array2;

    }


}