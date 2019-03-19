import java.util.Scanner;

public class Suma {
    public static void main(String[] args){
        System.out.println("Program polega na wpisaniu liczby wiekszej od 1000, a program wykonuje sume cyfr tej liczby.");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        while(a<=1000) {
            System.out.println("Liczba musi byc wieksza od 1000!");
            Scanner warunkowa = new Scanner(System.in);
            a = warunkowa.nextInt();
        }
            int b = a;
            double suma = 0;
            while (b > 0) {
                suma = suma + b % 10;
                b = b / 10;
            }
            System.out.println(suma);
        }
    }