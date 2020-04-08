package Sortowanie;
public class Babelkowe implements Sortable {

int step_counting;
int zmiana =1;

public int[] sort(int[]tab) {

    int a, i;
    while(zmiana > 0){ zmiana = 0;

        for (i = 0; i < tab.length - 1; i++) {

            if (tab[i] > tab[i + 1]) {
                a = tab[i + 1];
                tab[i + 1] = tab[i];
                tab[i] = a;
                zmiana++;
                step_counting++;

            }
        }
    }

    for (i = 0; i < tab.length; i++) {

        System.out.print(tab[i] + " ");

    }

        System.out.println("Sortowanie zakończone");
        return new int [0];

    }

    public double step_counting() {

        System.out.println("Naliczone kroki:"+ step_counting);
        return 0;
    }
}
