public class Main {
    public static void main(String[] args) {
        PaymentMethod cardPaymentMethod = new CardPaymentMethod();
        PaymentStrategy strategy = new PaymentStrategyImpl();
        strategy.pay(cardPaymentMethod);

        PaymentMethod upiPaymentMethod = new UpiPaymentMethod();
        strategy.pay(upiPaymentMethod);

        PaymentMethod cashPaymentMethod = new CashPaymentMethod();
        strategy.pay(cashPaymentMethod);
    }
}