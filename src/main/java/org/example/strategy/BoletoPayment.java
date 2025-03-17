package org.example.strategy;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        String boletoCode = String.format("%05d.%05d.%05d-%02d", random.nextInt(99999), random.nextInt(99999), random.nextInt(99999), random.nextInt(99));
        System.out.println("Pagamento via Boleto realizado com sucesso.");
        System.out.println("Código do Boleto: " + boletoCode);
        System.out.println("Valor: R$ " + amount);
    }
}
