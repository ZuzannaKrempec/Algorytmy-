
    import java.util.Scanner;

    public class silnia {
        public double silniar(int a) {
            if (a < 2) {
                return 1;
            }
            return a * silniar(a - 1);
        }

        public double silniai(int a) {
            int b = 0;
            int i = 0;
            while (i <= a) {
                b = b * i;
                i++;
            }
            return b;
        }

        public static void main(String[] args){
            int b=0;
            String a=new String();
            silnia s = new silnia();
            System.out.println("Wybierz sposob obliczania silni 1-rekurencja  inne-iteracja");
            Scanner scanner =new Scanner(System.in);
            a=scanner.nextLine();
            System.out.println("Podaj z jakiej liczby silnia");
            b=scanner.nextInt();
            if(a.equals("1")==true){
                System.out.println("wynik to "+s.silniar(b));
            }
            else {
                System.out.println("wynik to "+s.silniai(b));
            }
        }
    }
