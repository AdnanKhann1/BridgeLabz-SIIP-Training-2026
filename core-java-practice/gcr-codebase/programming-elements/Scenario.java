public class Scenario {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 25;
        String rank = "Member";
        double salary = 50000;
        float membershipFee = 1499.75f;

        int bonus = (int)(salary * 0.12);

        System.out.println("Welcome Card");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership Fee: " + membershipFee);
        System.out.println("Annual Bonus: " + bonus);
    }
}