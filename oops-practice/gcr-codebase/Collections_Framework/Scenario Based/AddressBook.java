import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Phone number already exists!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added.");
    }

    static void searchContact(String name) {

        Contact c = map.get(name);

        if (c != null) {
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
            System.out.println("Email: " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void deleteContact(String name) {

        Contact c = map.get(name);

        if (c == null) {
            System.out.println("Contact Not Found.");
            return;
        }

        contacts.remove(c);
        map.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted.");
    }

    static void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nAddress Book:");

        for (Contact c : contacts) {
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Adnan", "9876543210", "adnan@gmail.com");
        addContact("Ali", "9999999999", "ali@gmail.com");
        addContact("Zaid", "8888888888", "zaid@gmail.com");

        searchContact("Ali");

        deleteContact("Zaid");

        displayContacts();
    }
}
