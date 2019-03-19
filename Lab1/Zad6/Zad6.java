import java.util.Random;
import java.util.Scanner;
public class Zad6 {
    public int max(int tab[],int il){             //Metoda szukająca maksymanej wartości z tablicy
        int a=tab[0];
        for(int i=0 ;i<il;i++){
            if(tab[i]>a){
                a=tab[i];
            }
        }

        return a;
    }
    public int min(int tab[],int il){                  //Metoda szukająca minimalnej wartości z tablicy
        int a=tab[0];
        for(int i=0 ;i<il;i++){
            if(tab[i]<a){
                a=tab[i];
            }
        }

        return a;
    }
    public int rozrzut(int max,int min){                           //Metoda licząca rozrzut wartości
        int a=max-min;
        return a;
    }
    public double sr(int tab[],int il) {                           //Metoda licząca średnią arytmetyczną wszystkich elementów tablicy
        int sum = 0;
        for (int i = 0; i < il; i++) {
            sum = sum + tab[i];
        }
        return sum / il;
    }
    public int suma(int tab[],int il){                      //Metoda licząca sumę wszystkich elementów tablicy
        int suma=0;
        for(int i=0;i<il;i++){
            suma=suma+tab[i];
        }
        return suma;
    }
    public double war(double sr1,int tab[],int il){            // Metoda licząca wariancję
        double a=0;
        for(int i=0;i<il;i++){
            a=a+(tab[i]-sr1)*(tab[i]-sr1);
        }
        a=a/il;
        return a;
    }
    public double odch(double war){                            // Metoda licząca odchylenie standardowe
        return Math.sqrt(war);
    }
    public int podtrzy(int tab[],int il){                      //Metoda licząca, czy występują elementy podzielne przez 3 wraz z ich liczbą
        int a=0;
        for(int i=0;i<il;i++){
            if((tab[i]%3)==0){
                a++;
            }
        }
        return a;
    }


    public static void main(String[] args){
        System.out.println("Podaj ilość i do jakiego zakresu mają być liczby uzupełniajace tablice");
        Scanner scanner=new Scanner(System.in);
        int il=scanner.nextInt();
        int za=scanner.nextInt();
        Zad6 tablica=new Zad6();
        Random random =new Random();
        int tab[]=new int[il];
        for(int i=0;i<il;i++){
            tab[i]=random.nextInt(za);
        }
        System.out.println("średnia "+tablica.sr(tab,il));
        System.out.println("max "+tablica.max(tab,il));
        System.out.println("min "+tablica.min(tab,il));
        System.out.println("suma "+tablica.suma(tab,il));
        System.out.println("rozrzut "+tablica.rozrzut(tablica.max(tab,il),tablica.min(tab,il)));
        System.out.println("odchylenie standardowe "+tablica.odch(tablica.war(tablica.sr(tab,il),tab,il)));
        System.out.println("wariancja "+tablica.war(tablica.sr(tab,il),tab,il));
        System.out.println("podzielnych przez 3 jest "+tablica.podtrzy(tab,il));
        System.out.println("ostatni element ma wartość "+tab[il-1]);
    }
}