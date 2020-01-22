import java.util.Scanner;

public class Test4доп {

    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.println("Ввести десятичный номер: ");
        String bin = x.nextLine();
        int n = Integer.parseInt(bin);
        String a = Integer.toBinaryString(n);
        System.out.println("Бинарное значене числа " + n + " = " + a);



    }

}