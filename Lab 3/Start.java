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






/*
        public static void main(String[] args){
            int Tab[] = new int[200];
            System.out.println("Nieposortowane");
            for(int i = 0;i<200;i++) {
                Random liczba = new Random();
                Tab[i] = liczba.nextInt(200);
                System.out.print(Tab[i]+ ",");
            }
            System.out.println("Stop");


            Kubełkowe m = new Kubełkowe();
            Sortable d = m;
            m.sort(Tab);
            m.step_counting();

            Bąbelkowe r = new Bąbelkowe();
            Sortable c = r;
            r.sort(Tab);
            r.step_counting();


        }

    }


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
    {

        for (int i = 0; i < 200; i++) {
            Random liczba = new Random();
            tab[i] = liczba.nextInt(200);
        }

        //pokaże mi piekna tablice 200 elementow losowych z zakresu 20
        //System.out.println(Arrays.toString(tab));

        System.out.println("Wybierz algorytm");
        System.out.println("1 to Kubelkowa metoda");
        System.out.println("2 to Babelkowa metoda");
        Scanner wybor = new Scanner(System.in);

        int n = wybor.nextInt();
        if (n == 1)
        {
            Kubełkowa kubełkowa = new Kubełkowa();
            System.out.println(Arrays.toString(kubełkowa.sort(tab)));
            System.out.println(kubełkowa.step_counting());
        }

        else if (n == 2)
        {
            Bąbelkowa bąbelkowa = new Bąbelkowa();
            System.out.println(Arrays.toString(bąbelkowa.sort(tab)));
            System.out.println(bąbelkowa.step_counting());
        }

        else
        {
            System.out.println("Nie rozpoznano wyboru, wybierz poprawna opcje");
        }



    }
}
*/