package behavioural_design_pattern.template_example;

public abstract class PaymentFlow {
    public void validateRequest(){ //it will remain same for all types of payments
        System.out.println("Request Validated");
    }
    //Below logics be different so child classes can have their own logic
    public abstract void calculatePlatformFees();
    public abstract void debitAmount();
    public abstract void calculatePaymentGatewayFees();
    public abstract void creditAmount();

    //Marked as final, so child classes cannot override but just follow the same flow
    public final void sendMoney(){
        //Step1
        validateRequest();
        //Step2
        calculatePlatformFees();
        //Step3
        debitAmount();
        //Step4
        calculatePaymentGatewayFees();
        //Step5
        creditAmount();
    }
}
