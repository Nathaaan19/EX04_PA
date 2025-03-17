package org.example;

import java.util.Scanner;

import org.example.processor.PaymentProcessor;
import org.example.strategy.BoletoPayment;
import org.example.strategy.CreditCardPayment;
import org.example.strategy.PixPayment;
import org.example.strategy.PaymentStrategy;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentStrategy strategy = null;

        System.out.println("Método de pagamento (digite o número):");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Escolha: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        switch (choice) {
            case 1 -> strategy = new PixPayment();
            case 2 -> strategy = new CreditCardPayment();
            case 3 -> strategy = new BoletoPayment();
            default -> {
                System.out.println("Opção inválida.");
                System.exit(1);
            }
        }

        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.process(amount);

    }
}
