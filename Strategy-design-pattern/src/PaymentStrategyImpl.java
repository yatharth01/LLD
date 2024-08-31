public class PaymentStrategyImpl implements PaymentStrategy{
    @Override
    public void pay(PaymentMethod method) {
        method.pay();
    }
}
