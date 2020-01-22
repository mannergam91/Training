import java.util.Scanner; // импорт сканера

public class Test6 {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите z");
        double numberz = scan.nextInt();
        System.out.println("Введите y");
        double numbery = scan.nextInt();
        System.out.println("Введите x");
        double numberx = scan.nextInt();
        double q = ((numberx + numbery + numberz)/3);
        System.out.printf("q" + " = " + "%.5f\n", q);
        if (q/2 > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
        else
        {
            System.out.println("Программа выполнена не корректно");
        }
    }
}