import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        //вводим пять переменных
        System.out.print("Введите A: ");
        int a = in.nextInt();
        System.out.print("Введите B, большее A: ");
        int b = in.nextInt();
        System.out.print("Введите C,большее B: ");
        int c = in.nextInt();
        System.out.print("Введите D, большее C: ");
        int d = in.nextInt();
        System.out.print("Введите X, не равное A, B, C и D: ");
        int x = in.nextInt();
        if (x<a)
        //если x меньше a, он находиться на первом участке
            System.out.println(1);
        else
            if (x<b)
                //если х меньше b и при этом не находится на первом участке, он находится на втором участке
                System.out.println(2);
            else
                if (x<c)
                    //если х меньше с и при этом не находится ни на первом, нинатвтором участке, он находится на третьем участке
                    System.out.println(3);
                else
                    if (x<d)
                        //если х меньше d и при этом ни находится на предыдущих участках, он находитс на четвертом участке
                        System.out.println(4);
                    else
                        //если х не меньше d, а больше, значит он находится на пятом участке
                        System.out.println(5);
    }
}
