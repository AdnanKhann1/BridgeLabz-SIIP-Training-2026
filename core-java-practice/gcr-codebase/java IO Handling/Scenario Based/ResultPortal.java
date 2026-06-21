import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResultPortal {

    public static void generateReportCard(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    continue;
                }

                String name = parts[0].trim();
                double sum = 0;
                int count = parts.length - 1;

                for (int i = 1; i < parts.length; i++) {
                    sum += Double.parseDouble(parts[i].trim());
                }

                double average = count > 0 ? sum / count : 0.0;

                writer.write(String.format("Student: %-15s | Average Marks: %.2f%n", name, average));
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: The input source file '" + inputFile + "' was not found.");
        } catch (IOException e) {
            System.err.println("I/O Error occurred while processing data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Data Format Error: Unable to parse student marks. Check input file configuration.");
        }
    }
}