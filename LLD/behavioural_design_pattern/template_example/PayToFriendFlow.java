package behavioural_design_pattern.template_example;

public class PayToFriendFlow  extends PaymentFlow{

    @Override
    public void calculatePlatformFees() {
        System.out.println("No Platform fees for PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.err.println("Amount debited");
    }

    @Override
    public void calculatePaymentGatewayFees() {
        System.out.println("No Payment Gateway fees for PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.err.println("Amount credited");
    }
    
}
