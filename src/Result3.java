import java.util.Scanner;
public class Result3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите курс доллара к рублю: ");
        float x = scan.nextFloat();
        System.out.print("Введите колличество рублей: ");
        float y = scan.nextFloat();
        float z;
        z = y/x;

        System.out.printf("%.2f" + " доллара", z);
    }
}