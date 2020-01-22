

import java.util.Scanner;

public class Test13 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое слово для сравнения");
        String z = scan.nextLine();
        System.out.println("Введите второе слово для сравнения");
        String y = scan.nextLine();

        int lenz = z.length();
        int leny = y.length();
        String q;
        if (lenz > leny)
            q = z;
        else if (lenz < leny)
            q = y;
        else
            q = "Слова равны";

        System.out.println(q);

    }
}