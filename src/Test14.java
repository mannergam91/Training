
import java.util.Scanner;

public class Test14 {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строковую переменную s");
        String s = scanner.nextLine();

        int x = Integer.parseInt(s);
        double y = (int) x;

        System.out.println(s + "\n" + x + "\n" + y );
    }

}