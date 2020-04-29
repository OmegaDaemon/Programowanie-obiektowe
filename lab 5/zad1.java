package projekt;
import java.util.Scanner;
public class zad1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Podaj pierwszą temperature");
         a = scan.nextInt();
        System.out.println("Podaj drugą temperature");
        b = scan.nextInt();
        if(a>100 & b>100)
        {
            System.out.println("Obie temeratury mają wartość powyżyej 100 stopni");
        }

    }
}
