interface Messenger {
    void sendMessage(String msg);
}

class WhatsApp implements Messenger {
    public void sendMessage(String msg) {
        System.out.println("Sending message via WhatsApp: " + msg);
    }
}

class Email implements Messenger {
    public void sendMessage(String msg) {
        System.out.println("Sending message via Email: " + msg);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Messenger m1 = new WhatsApp();
        m1.sendMessage("Hello!");

        Messenger m2 = new Email();
        m2.sendMessage("Hi there!");
    }
}
