package behavioural_design_pattern.observable_example;

public class SMSObserver implements NotificationObserver {
    private String phone;
    SMSObserver(String phone){
        this.phone = phone;
    }

    @Override
    public void update(int stockCount) {
        System.err.println("SMS sent to "+ phone+" Stock available: "+ stockCount);
    }
}
