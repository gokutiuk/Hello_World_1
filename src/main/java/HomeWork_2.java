public class HomeWork_2
{
    public static void main (String [] args)
    {
       HomeWork_2.zadacha_13  ("Я тут один");

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
    public static void zadacha_2 (int x, int y , int z)
    {

    }
    public static void zadacha_3 ( int n )
    {
        int result=1;
        for ( int i = 1; i <= n; i++ )
        {
            result=result*i;
        }
        System.out.println( result);

    }
    public static int zadacha_4 (int  n )
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
    public static  void  zadacha_5 (int [] massive)
    {

        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
        System.out.println(massive);


    }

    public static int zadacha_6 (int n[])
    {

        return 0;
    }
    public static String zadacha_7 (int n )
    {
        String str = Integer.toString(n);
        return str;

    }
    public static String zadacha_8 (double n )
    {
        String str = Double.toString(n);
        return str;

    }
    public static int zadacha_9 (String str )
    {
        int n = Integer.parseInt(str);
        return n;

    }
    public static double zadacha_10 (String str)
    {
        double n = Double.parseDouble(str);
        return n;

    }
    public static int zadacha_11 (String str)
    {
        System.out.println(str.length());
        return str.length();
    }
    public static String zadacha_12 (String str)
    {


        String shortestWord = str;
        for ( String wrd : str.split("[\\p{Space}\\p{Punct}]+") )
            if ( wrd.length() < shortestWord.length() )
                shortestWord = wrd;

        System.out.println("First shortest word (" + shortestWord.length() + " symbols) is " + shortestWord);
        return shortestWord;


    }
    public static  int zadacha_13 ( String str )
    {
        String[] splitArray = str.split("([^а-яА-Яa-zA-Z']+)'*\\1*");
        splitArray.toString();
        System.out.println(splitArray);
        return splitArray.length;
    }

}
