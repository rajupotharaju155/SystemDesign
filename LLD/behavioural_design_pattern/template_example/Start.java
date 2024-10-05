package behavioural_design_pattern.template_example;

public class Start {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriendFlow();
        payToFriend.sendMoney();
        System.err.println("************************");
        PaymentFlow payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();
    }
}
