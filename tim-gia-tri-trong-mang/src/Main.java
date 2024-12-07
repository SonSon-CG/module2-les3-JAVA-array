import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (inputName.equals(students[i])) {
                System.out.println(students[i]+" co ten trong danh sach");
                break;
            }
        }
    }
}