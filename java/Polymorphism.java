
// Parent class
class MessageSender {
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}

// Child classes
class EmailSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}

class SMSSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS Sent: " + message);
    }
}

class PushSender extends MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Push Notification Sent: " + message);
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        
        MessageSender email = new EmailSender();
        MessageSender sms = new SMSSender();
        MessageSender push = new PushSender();

        
        email.send("Meeting at 3 PM");
        sms.send("Your OTP is 1234");
        push.send("New update available!");
    }
}
