package PagamentoOnline;
import java.math.BigDecimal;

// Interface para as estratégias de pagamento
interface EstrategiaPagamento {
    void processarPagamento(BigDecimal valor);
}

// Estratégia de pagamento para o PayPal
class PagamentoPayPal implements EstrategiaPagamento {
    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Processando pagamento via PayPal de R$" + valor);
        // Lógica de processamento de pagamento do PayPal
    }
}

// Estratégia de pagamento para o Stripe
class PagamentoStripe implements EstrategiaPagamento {
    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Processando pagamento via Stripe de R$" + valor);
        // Lógica de processamento de pagamento do Stripe
    }
}

// Estratégia de pagamento para o PagSeguro
class PagamentoPagSeguro implements EstrategiaPagamento {
    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Processando pagamento via PagSeguro de R$" + valor);
        // Lógica de processamento de pagamento do PagSeguro
    }
}

// Classe cliente (Contexto)
class ProcessadorPagamento {
    private EstrategiaPagamento estrategiaPagamento;

    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void processarPagamento(BigDecimal valor) {
        if (estrategiaPagamento == null) {
            System.out.println("Nenhuma estratégia de pagamento definida.");
            return;
        }
        estrategiaPagamento.processarPagamento(valor);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
//
//        // Processamento de pagamento via PayPal
//        processadorPagamento.setEstrategiaPagamento(new PagamentoPayPal());
//        processadorPagamento.processarPagamento(new BigDecimal("100.00"));
//
//        // Processamento de pagamento via Stripe
//        processadorPagamento.setEstrategiaPagamento(new PagamentoStripe());
//        processadorPagamento.processarPagamento(new BigDecimal("200.00"));
//
//        // Processamento de pagamento via PagSeguro
//        processadorPagamento.setEstrategiaPagamento(new PagamentoPagSeguro());
//        processadorPagamento.processarPagamento(new BigDecimal("150.00"));
//    }
}
