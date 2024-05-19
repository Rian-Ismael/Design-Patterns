import java.math.BigDecimal;

// Interface para as estratégias de pagamento
interface PaymentStrategy {
    void processPayment(BigDecimal amount);
}

// Estratégia de pagamento com cartão de crédito
class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        // Lógica para processar o pagamento com cartão de crédito
        System.out.println("Pagamento de $" + amount + " processado com cartão de crédito " + cardNumber);
    }
}

// Estratégia de pagamento com transferência bancária
class BankTransferPaymentStrategy implements PaymentStrategy {
    private String accountNumber;
    private String sortCode;

    public BankTransferPaymentStrategy(String accountNumber, String sortCode) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        // Lógica para processar o pagamento com transferência bancária
        System.out.println("Pagamento de $" + amount + " processado por transferência bancária para conta " + accountNumber);
    }
}

// Classe cliente (Contexto)
class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(BigDecimal amount) {
        if (paymentStrategy == null) {
            System.out.println("Nenhuma estratégia de pagamento definida.");
            return;
        }
        paymentStrategy.processPayment(amount);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        PaymentProcessor processor = new PaymentProcessor();
//
//        // Pagamento com cartão de crédito
//        processor.setPaymentStrategy(new CreditCardPaymentStrategy("1234 5678 9012 3456", "12/25", "123"));
//        processor.processPayment(new BigDecimal("100.00"));
//
//        // Pagamento por transferência bancária
//        processor.setPaymentStrategy(new BankTransferPaymentStrategy("12345678", "12-34-56"));
//        processor.processPayment(new BigDecimal("200.00"));
//    }
}
