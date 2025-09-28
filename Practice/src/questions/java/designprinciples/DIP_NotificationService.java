package java.designprinciples;

interface MessageService {

    void sendMessage();
}

public class DIP_NotificationService {

    private MessageService messageService;

    public DIP_NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }


    void sendNotification() {
        messageService.sendMessage();
    }
}

class EmailService implements MessageService {


    @Override
    public void sendMessage() {
        System.out.println(" Sending msg through Email");
    }
}


class SmsService implements MessageService {


    @Override
    public void sendMessage() {
        System.out.println(" Sending msg through SMS");
    }
}


class Test_DIP {

    public static void main(String[] args) {


        MessageService messageService = new EmailService();

        DIP_NotificationService notificationService = new DIP_NotificationService(messageService);
        notificationService.sendNotification();
    }
}