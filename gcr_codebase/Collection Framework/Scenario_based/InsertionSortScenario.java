import java.util.Arrays;

public class InsertionSortScenario {

    public static void insertionSort(int[] scores) {

        for (int i = 1; i < scores.length; i++) {

            int current = scores[i];
            int j = i - 1;

            while (j >= 0 && scores[j] > current) {

                scores[j + 1] = scores[j];
                j--;
            }

            scores[j + 1] = current;
        }

        System.out.println(Arrays.toString(scores));
    }

    public static void main(String[] args) {

        int[] scores = {88, 75, 93, 67, 90, 85, 99};

        insertionSort(scores);
    }
}
