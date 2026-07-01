import java.util.HashSet;

public class EventEntry {

    static HashSet<String> participants = new HashSet<>();

    static void register(String email) {

        if (participants.add(email)) {
            System.out.println("Registration Successful.");
        } else {
            System.out.println("Duplicate Registration Rejected.");
        }
    }

    static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        register("adnan@gmail.com");
        register("ali@gmail.com");
        register("zaid@gmail.com");
        register("ali@gmail.com");

        displayParticipants();
    }
}
