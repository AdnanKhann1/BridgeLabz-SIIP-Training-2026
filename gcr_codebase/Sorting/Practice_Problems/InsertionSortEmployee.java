import java.util.Arrays;

public class InsertionSortEmployee {

    public static void main(String[] args) {

        int[] employeeIds = {104, 101, 108, 102, 105};

        for (int i = 1; i < employeeIds.length; i++) {

            int current = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > current) {

                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = current;
        }

        System.out.println(Arrays.toString(employeeIds));
    }
}
