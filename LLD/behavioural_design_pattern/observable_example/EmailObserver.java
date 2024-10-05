package behavioural_design_pattern.observable_example;

public class EmailObserver implements NotificationObserver{
    private String email;
    EmailObserver(String email){
        this.email = email;
    }
    @Override
    public void update(int stockCount) {
        System.err.println("Email Sent to "+ email+" Stock available: "+ stockCount);
    }
}
