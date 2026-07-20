import java.util.Arrays;

public class BubbleSortScenario {

    public static void bubbleSort(int[] scores) {

        int swapCount = 0;
        boolean swapped;

        for (int i = 0; i < scores.length - 1; i++) {

            swapped = false;
            for (int j = 0; j < scores.length - i - 1; j++) {


                if (scores[j] > scores[j + 1]) {

                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    swapCount++;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println("Array was already sorted.");
                break;
            }
        }

        System.out.println("Sorted Scores : " + Arrays.toString(scores));
        System.out.println("Total Swaps : " + swapCount);
    }

    public static void main(String[] args) {

        int[] scores = {88, 75, 93, 67, 90, 85, 99};

        bubbleSort(scores);
    }
}
