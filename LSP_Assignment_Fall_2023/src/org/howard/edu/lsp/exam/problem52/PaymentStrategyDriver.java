package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        cart = new ShoppingCart(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);

        cart = new ShoppingCart(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart.checkout(75.0);
    }
}