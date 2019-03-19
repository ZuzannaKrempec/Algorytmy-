import java.util.Scanner;


public class NWW
{
public static int NWD(int a, int b)
     {
         while(a!=b)
         {
             if (a > b)
                 a -= b;
             else
                 b -= a;
         }
         return a;
    }
    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program liczy NWW i NWD, podaj dwie liczby:\n");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("NWW Liczb" + a + "i" + b + "wynosi " + ((a*b)/NWD(a,b)));
        System.out.println("NWD tych liczb wynosi" + (NWD(a,b)));
    }
}