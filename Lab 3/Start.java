package Sortowanie;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Start {

    public static void main(String[] args) {

        int[] tab = new int[200];
        for (int i = 0; i < 200; i++) {

            Random liczba = new Random();
            tab[i] = liczba.nextInt(200);
            System.out.print(tab[i] + ",");

        }

        System.out.println("Wybierz metode sortowania");
        System.out.println("1\t Metoda Bąbelkowa ");
        System.out.println("2\t Metoda Kubełkowa");

        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        switch (n) {

            case 1:
                System.out.println("Sortowanie Bąbelkowe");
                Babelkowe babelkowa = new Babelkowe();
                System.out.println(Arrays.toString(babelkowa.sort(tab)));
                System.out.println(babelkowa.step_counting());
                break;

            case 2:
                System.out.println("Sortowanie Kubełkowe");
                Kubelkowe kubelkowa = new Kubelkowe();
                System.out.println(Arrays.toString(kubelkowa.sort(tab)));
                System.out.println(kubelkowa.step_counting());
                break;

            default:

                System.out.println("Nieprawidłowy wybór");

        }
    }
}