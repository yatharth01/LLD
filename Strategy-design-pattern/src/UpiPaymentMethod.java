public class UpiPaymentMethod implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Payment via UPI");
    }
}
