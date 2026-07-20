import java.util.Arrays;

public class TopThreeMedalists {

    public static void main(String[] args) {

        int[] scores = {88, 75, 93, 67, 90, 85, 99};

        Arrays.sort(scores);

        System.out.println("Gold : " + scores[scores.length - 1]);
        System.out.println("Silver : " + scores[scores.length - 2]);
        System.out.println("Bronze : " + scores[scores.length - 3]);
    }
}
