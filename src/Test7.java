import java.util.Scanner; // импорт сканера

class Test7 {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double number = scan.nextInt();
        int X = 5;
        int Y = 6;
        int Z = 7;

        if (number == 5 || number == 6 || number == 7)
        {
            System.out.println("Данное значение имеется в константах");
        }
        else
        {
            System.out.println("Такой константы нет!");
        }
    }
}
