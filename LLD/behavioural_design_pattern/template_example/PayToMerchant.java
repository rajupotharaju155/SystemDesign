package behavioural_design_pattern.template_example;

public class PayToMerchant extends PaymentFlow {

    @Override
    public void calculatePlatformFees() {
        System.out.println("2% Platform Fees for PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.err.println("Amount debited including Platform Fees");
    }

    @Override
    public void calculatePaymentGatewayFees() {
        System.out.println("5% Payment Gateway charges to be beared by Merchant");
    }

    @Override
    public void creditAmount() {
        System.err.println("Amount credited after deducting Payment Gateway charges");
    }
}
