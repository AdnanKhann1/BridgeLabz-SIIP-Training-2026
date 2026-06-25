class Notification {
    String name;
    String msg;

    Notification(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    void send() {
        // Base method placeholder
    }
}

class EmailNotification extends Notification {
    EmailNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void send() {
        System.out.println("[Email] " + name + " : " + msg);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void send() {
        System.out.println("[SMS] " + name + " : " + msg);
    }
}

class PushNotification extends Notification {
    PushNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void send() {
        System.out.println("[Push] " + name + " : " + msg);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {

        Notification[] list = {
            new EmailNotification("Alice", "Invoice is ready"),
            new SMSNotification("Bob", "Your OTP is 4821"),
            new PushNotification("Charlie", "New follower!")
        };

        for (Notification ele : list) {
            ele.send();
        }
    }
}