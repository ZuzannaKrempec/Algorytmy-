import java.util.Scanner;
public class Potega {
    public double potega(int a, int b){
        double c=a;
        for(int i=1;i!=b;i++){
            c=c*a;
        }
        return c;
    }
    public static void main(String[] args){
        System.out.println("Podaj liczbe i wykladnik potegi: ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Potega nta= new Potega();
        System.out.println("Ta liczba to "+nta.potega(a,b));
    }
}