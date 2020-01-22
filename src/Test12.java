import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine();
        String t = text.replaceAll(" ","");
        System.out.println(t);
    }
}