package Projekt4;
import java.util.Scanner;
public class Zadanie2 {

    public static void main(String[] args) {

        System.out.println("Podaj znaki");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        try {

           int z= Integer.parseInt(s.trim());
            System.out.println("int z = " + z);

        }

        catch (NumberFormatException nfe){

            System.out.println("To nie liczba");

        }
    }
}
