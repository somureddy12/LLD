interface Notification{
    void send();
}

class push implements Notification{
    public void send(){
        System.out.println("Sending Push Notification");
    }
}

class SMS implements Notification{
    public void send(){
        System.out.println("Sending SMS Notification");
    }
}

class Email implements Notification{
    public void send(){
        System.out.println("Sending Email Notification");
    }
}
class NotificationFactory{
    public Notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        if(type.equalsIgnoreCase("PUSH")){
            return new push();
        } else if(type.equalsIgnoreCase("SMS")){
            return new SMS();
        } else if(type.equalsIgnoreCase("EMAIL")){
            return new Email();
        }
        return null;
    }
}
class FactoryDesignPattern{
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.send();

        Notification notification1 = notificationFactory.createNotification("SMS");
        notification1.send();

        Notification notification2 = notificationFactory.createNotification("PUSH");
        notification2.send();
    }
}