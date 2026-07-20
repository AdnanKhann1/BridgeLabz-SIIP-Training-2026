import java.util.Arrays;

public class EmployeeAttendanceRanking {

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        int n = employeeIds.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                boolean shouldSwap = false;

                if (attendance[j] < attendance[j + 1]) {

                    shouldSwap = true;
                }

                else if (attendance[j] == attendance[j + 1]
                        && employeeIds[j] > employeeIds[j + 1]) {

                    shouldSwap = true;
                }

                if (shouldSwap) {

                    int tempAttendance = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = tempAttendance;

                    int tempId = employeeIds[j];
                    employeeIds[j] = employeeIds[j + 1];
                    employeeIds[j + 1] = tempId;
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = employeeIds[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};

        int k = 3;

        int[] answer = topKEmployees(employeeIds, attendance, k);

        System.out.println(Arrays.toString(answer));
    }
}
