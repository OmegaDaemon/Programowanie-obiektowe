package projekt;
public class zad2 {

        int[] tab;
        public zad2(int[] tab) { this.tab = tab; }

        public boolean sprawdzamsekwencje(int[] tab) {
            int i = tab.length;
            int n;

            for (n = 0; n < i - 2; n++) {

                if (tab[n] == 1 && tab[n + 1] == 2 && tab[n + 2] == 3) { return true; }

            }

            return false;
        }
    }
