import java.util.Scanner;

public class Homework_3
{
    public static Scanner scan = new Scanner(System.in);
    public static void main ( String [] args)
    {

        Homework_3.zadacha_1();
    }

    public static String zadacha_1 ()
    {
        String res="";
        System.out.println("Введите фигуру № Фигуры 1 = Квадрат, 2 = Треугольник,  3 = Прямоугольник, 4 = Круг ");

        int N = Integer.parseInt(scan.nextLine());

        if (N ==1)

        {

            System.out.println("Введите сторону квадрата A = ");
            int a = Integer.parseInt(scan.nextLine());
            if (a>=1)
            {
               int  P =4*a;
               int S= a*a;

               res = "Периметр квадрата = "+P+" Площадь квадрата="+S;

               System.out.println(res);


                return res ;


            }
            else
                return res="Неверное условие";

        }
        else if (N==2)
        {
            System.out.println("Введите сторону треульника A = ");
            int a = Integer.parseInt(scan.nextLine());
            System.out.println("Введите сторону треульника B = ");
            int b = Integer.parseInt(scan.nextLine());
            System.out.println("Введите сторону треульника C = ");
            int c = Integer.parseInt(scan.nextLine());
            if (a+b+c>=1)
            {
                int P =a+b+c;
                double S=a*b/2;

                res = "Периметр треугольника = "+P+" Площадь треугольника="+S;

                System.out.println(res);

                return res =  "Периметр треугольника = "+P+" Площадь треугольника="+S;
            }
            else
                return res="Неверное условие";


        }
        else if (N==3)
        {
            System.out.println("Введите сторону прямоульника A = ");
            int a = Integer.parseInt(scan.nextLine());
            System.out.println("Введите сторону прямоульника B = ");
            int b = Integer.parseInt(scan.nextLine());

            if (a+b>=1)
            {
                int P =(a+b)*2;
                int S=a*b;
                res = "Периметр прямоугольника = "+P+" Площадь прямоугольника="+S;

                System.out.println(res);
                return res =  "Периметр прямоугольника = "+P+" Площадь прямоугольника="+S;
            }
            else
                return res="Неверное условие";

        }
        else if (N==4)
        {
            System.out.println("Введите Радиус круга r = ");
            int r = Integer.parseInt(scan.nextLine());
            if (r>=1)
            {
                double pi=3.14;
               double S= pi*(r*r);
               double P=2*pi*r;

                res = "Периметр Круга = "+P+" Площадь Круга="+S;

                System.out.println(res);
                return res =  "Периметр Круга = "+P+" Площадь Круга="+S;


            }
            else
                return res="Неверное условие";

        }



        return res="Введите значение в верном формате например квадрат";

    }
    public static int zadacha_2 (int x, int y, int z)
    {
        int res;
        if (x>0 && y>0 && z<0)
        {
            System.out.println("Первая область");
            res=1;
        }
        else  if (x>0 && y>0 && z>0)
        {
            System.out.println("Вторая область");
            res=2;
        }
        else  if (x<0 && y>0 && z>0)
        {
            System.out.println("Третяя область");
            res=3;
        }
        else  if (x<0 && y>0 && z<0)
        {
            System.out.println("Четвертая область");
            res=4;
        }
        else  if (x>0 && y<0 && z<0)
        {
            System.out.println("Пятая область");
            res=5;
        }
        else  if (x>0 && y<0 && z>0)
        {
            System.out.println("Шестая область");
            res=6;
        }
        else  if (x<0 && y<0 && z>0)
        {
            System.out.println("Седьмая область");
            res=7;
        }
        else  if (x<0 && y<0 && z<0)
        {
            System.out.println("Восьмая");
            res=8;
        }
        else  if (x==0 && y==0 && z==0)
        {
            System.out.println("Точка в нулевой координате");
            res=0;
        }
        else if (x==0 || y==0 || z==0)
        {
            System.out.println("Точка в нулевой на какойто из оси ");
            res=0 ;
        }
        else
            {  return res=0 ;

            }
        return res=0 ;




    }

}
