import java.math.BigDecimal;

// Classe abstrata que define o template method para processamento de boletos
abstract class BoletoProcessor {
    // Template method que define a estrutura geral do processamento de boletos
    public void processBoleto(BigDecimal amount) {
        validateBoleto();
        BigDecimal discountedAmount = applyDiscount(amount);
        generatePaymentSlip(discountedAmount);
    }

    // Método abstrato que deve ser implementado pelas subclasses para validar o boleto
    protected abstract void validateBoleto();

    // Método abstrato que deve ser implementado pelas subclasses para aplicar desconto ao boleto
    protected abstract BigDecimal applyDiscount(BigDecimal amount);

    // Método concreto que gera o boleto de pagamento
    protected void generatePaymentSlip(BigDecimal amount) {
        System.out.println("Boleto gerado para pagamento no valor de R$" + amount);
    }
}

// Subclasse que implementa o processamento de boletos para cliente regular
class RegularBoletoProcessor extends BoletoProcessor {
    @Override
    protected void validateBoleto() {
        System.out.println("Validando boleto para cliente regular...");
        // Lógica de validação para cliente regular
    }

    @Override
    protected BigDecimal applyDiscount(BigDecimal amount) {
        System.out.println("Aplicando desconto para cliente regular...");
        // Lógica de aplicação de desconto para cliente regular
        return amount.multiply(BigDecimal.valueOf(0.95)); // Desconto de 5%
    }
}

// Subclasse que implementa o processamento de boletos para cliente VIP
class VipBoletoProcessor extends BoletoProcessor {
    @Override
    protected void validateBoleto() {
        System.out.println("Validando boleto para cliente VIP...");
        // Lógica de validação para cliente VIP
    }

    @Override
    protected BigDecimal applyDiscount(BigDecimal amount) {
        System.out.println("Aplicando desconto para cliente VIP...");
        // Lógica de aplicação de desconto para cliente VIP
        return amount.multiply(BigDecimal.valueOf(0.90)); // Desconto de 10%
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Processamento de boleto para cliente regular
//        BoletoProcessor regularBoletoProcessor = new RegularBoletoProcessor();
//        regularBoletoProcessor.processBoleto(new BigDecimal("100.00"));
//
//        System.out.println();
//
//        // Processamento de boleto para cliente VIP
//        BoletoProcessor vipBoletoProcessor = new VipBoletoProcessor();
//        vipBoletoProcessor.processBoleto(new BigDecimal("100.00"));
//    }
}
