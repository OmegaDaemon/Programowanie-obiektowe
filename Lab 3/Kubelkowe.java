package Sortowanie;
import java.util.Arrays;
public class Kubelkowe implements Sortable {

    public int[] sort(int[] array){

        int n = array.length;
        int step_counting, j;
        int[] bucket = new int[array.length + 1];
        Arrays.fill(bucket, 0);

        for (step_counting = 0; step_counting < n; step_counting++) {

            bucket[array[step_counting]]++;

        }

        int k = 0;
        for (step_counting = 0; step_counting < bucket.length; step_counting++) {

            for (j = 0; j < bucket[step_counting]; j++) {

                array[k++] = step_counting;

            }

        }

        System.out.print("ilość porównań:" + step_counting + "   posortowane:");

        for (int i : array) System.out.print(i + " ");

        return array;

    }
    @Override
    public double step_counting () {

        return 0;

   }
}
