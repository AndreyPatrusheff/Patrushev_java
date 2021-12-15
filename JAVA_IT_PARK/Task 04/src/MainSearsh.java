import java.util.Scanner;

public class MainSearsh {
    public static void main(String[] args) {
        int arrays[] = {3, 5, 10, -1, 34, 50, 11};

        Scanner scanner = new Scanner(System.in);
    // поиск числа из массива
        int forSearchNumber = scanner.nextInt();

        int position = -1;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == forSearchNumber) {
                position = i;
            }
        }
        System.out.println(position);
    }
}
