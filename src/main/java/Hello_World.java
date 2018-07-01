public class Hello_World
{
    public static void main (String [] args)
    {
       Hello_World.zadacha_6( 1);

    }
    public  static  void printMsg ( String s)
    {
        System.out.println(s);
    }
    public static int plus ( int a , int b)
    {

        int  res = a + b;
        return res;
    }
    public static double zadacha_1  (int a, int b, int c)
    {
        double result;
        int chetnoe_1 = a%2;
        int chetnoe_2= (a+c)%2;
        int chetnoe_3= (b+c)%2;

        if (chetnoe_1 == 0 )
        {
            result = a*b/c;

        }
        else if (chetnoe_2==0 || chetnoe_3 ==0)
        {
             result = Math.pow( a , c);
        }
        else
            result = (a+b)-c;
        return result;
    }
    public static void zadacha_2 ( int n )
    {
        int result=1;
        for ( int i = 1; i <= n; i++ )
        {
            result=result*i;
        }
        System.out.println( result);

    }
    public static int zadacha_3 (int  n )
    {   if (n>=10&&n<=99)

        {
            int n1 = n/10;
            int n2 = (n%10)*10;
            return  n2+n1;

         }

        else if (n >= 100 && n<=999 )
        {
            int n1=n/100;
            int n2=((n/10)%10)*10;
            int n3=((n%100)%10)*100;
            System.out.println(n3+n2+n1);
            return n3+n2+n1;
        }
        return 0;



    }
    public static int []  zadacha_4 (int [] massive)
    {

        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
        System.out.println(massive);
        return massive;

    }

    public static int zadacha_5 (int n[])
    {

        return 0;
    }
    public static String zadacha_6 (int n )
    {
        String str = Integer.toString(n);
        return str;

    }
    public static String zadacha_7 (double n )
    {
        String str = Double.toString(n);
        return str;

    }
    public static int zadacha_8 (String str )
    {
        int n = Integer.parseInt(str);
        return n;

    }
    public static double zadacha_9 (String str)
    {
        double n = Double.parseDouble(str);
        return n;

    }



}
