package org.example.strategy;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito realizado com sucesso.");
        System.out.println("Cartão: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Valor: R$ " + amount);
    }
}
