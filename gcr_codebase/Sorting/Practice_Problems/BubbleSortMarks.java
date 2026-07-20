import java.util.Arrays;

public class BubbleSortMarks {

    public static void main(String[] args) {

        int[] marks = {67, 92, 45, 88, 71};

        for (int i = 0; i < marks.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < marks.length - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(marks));
    }
}
