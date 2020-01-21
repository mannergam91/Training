import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ввести бинарный номер: ");
        String bin = x.nextLine();
        int N = Integer.parseInt(bin, 2);

        System.out.println(N);
    }

}