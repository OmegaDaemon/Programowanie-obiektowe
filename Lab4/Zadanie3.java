package Projekt4;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class Zadanie3 {
        public static void main(String[] args) {

            System.out.println("Ile cyfr chcesz podać?");
            Scanner scanner = new Scanner(System.in);
            int w = scanner.nextInt();
            int [] tab = new int[w];
            int liczba;
            boolean powtorka;
            System.out.format("Podaj swoje %d liczb\n", tab.length);

            for (int i = 0; i < tab.length; i++) {

                try {

                    System.out.print((i + 1) + ": ");
                    tab[i] = Integer.parseInt(scanner.next());

                }

                catch (NumberFormatException e) {

                    System.out.println("Liczbę, nie literę!");
                    i--;

                }

            }

            System.out.print("Jaki numer chcesz wyświetlić: ");

            do{

                try {

                    liczba = Integer.parseInt(scanner.next());
                    liczba--;
                    System.out.println("Liczba, którą wybrałeś to: " + tab[liczba]);
                    powtorka = false;

                }

                catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {

                    System.out.println("Bardzo źle");
                    powtorka = true;

                }

            }while(powtorka);
        }
    }
