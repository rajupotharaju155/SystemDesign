package behavioural_design_pattern.observable_example;

public class Start {
    public static void main(String[] args) {
        IPhoneStockObservable iPhoneStockObservable = new IPhoneStockObservable(0);
        EmailObserver emailSubscriber1 = new EmailObserver("abc@gmail.com");
        EmailObserver emailSubscriber2 = new EmailObserver("pqr@gmail.com");
        SMSObserver smsSubscriber1 = new SMSObserver("9987679999");

        iPhoneStockObservable.add(emailSubscriber1);
        iPhoneStockObservable.add(emailSubscriber2);
        iPhoneStockObservable.add(smsSubscriber1);

        // iPhoneStockObservable.notifyObservers();
        iPhoneStockObservable.getStockCount();
        iPhoneStockObservable.setStock(10);
        iPhoneStockObservable.getStockCount();
        iPhoneStockObservable.setStock(0);
        iPhoneStockObservable.getStockCount();
        iPhoneStockObservable.setStock(20);
        iPhoneStockObservable.getStockCount();
        iPhoneStockObservable.setStock(30);
        iPhoneStockObservable.getStockCount();

        // iPhoneStockObservable.notifyObservers();
    }
}
