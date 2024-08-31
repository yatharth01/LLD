public class CashPaymentMethod implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment via Cash");
    }
}
