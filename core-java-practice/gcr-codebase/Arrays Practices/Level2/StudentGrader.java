import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();

        int[][] marks = new int[students][3];
        double[] percentages = new double[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Mathematics: ");
            marks[i][2] = scanner.nextInt();

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\n--- Performance Report Card ---");
        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d -> P: %d, C: %d, M: %d | Percentage: %.2f%% | Grade: %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        scanner.close();
    }
}