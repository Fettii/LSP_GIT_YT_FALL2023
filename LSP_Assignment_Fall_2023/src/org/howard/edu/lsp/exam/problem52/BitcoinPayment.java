package org.howard.edu.lsp.exam.problem52;

public class BitcoinPayment implements PaymentStrategy {
    private String address;

    public BitcoinPayment(String address) {
        this.address = address;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin address " + address);
    }
}