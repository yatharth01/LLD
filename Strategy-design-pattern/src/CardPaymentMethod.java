public class CardPaymentMethod implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment via card");
    }
}
