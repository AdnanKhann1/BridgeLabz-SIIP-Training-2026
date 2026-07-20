import java.util.Arrays;

public class SelectionSortScores {

    public static void main(String[] args) {

        int[] scores = {70, 95, 82, 60, 88};

        for (int i = 0; i < scores.length - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < scores.length; j++) {

                if (scores[j] < scores[minimumIndex]) {

                    minimumIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minimumIndex];
            scores[minimumIndex] = temp;
        }

        System.out.println(Arrays.toString(scores));
    }
}
