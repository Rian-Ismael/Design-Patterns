import java.math.BigDecimal;

// Interface para as estratégias de desconto
interface EstrategiaDesconto {
    BigDecimal aplicarDesconto(BigDecimal total);
}

// Estratégia de desconto para cliente regular
class DescontoClienteRegular implements EstrategiaDesconto {
    @Override
    public BigDecimal aplicarDesconto(BigDecimal total) {
        return total.multiply(BigDecimal.valueOf(0.95)); // Desconto de 5% para cliente regular
    }
}

// Estratégia de desconto para cliente VIP
class DescontoClienteVIP implements EstrategiaDesconto {
    @Override
    public BigDecimal aplicarDesconto(BigDecimal total) {
        return total.multiply(BigDecimal.valueOf(0.90)); // Desconto de 10% para cliente VIP
    }
}

// Contexto (mercado)
class Mercado {
    private EstrategiaDesconto estrategiaDesconto;

    public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public BigDecimal calcularTotalComDesconto(BigDecimal total) {
        if (estrategiaDesconto == null) {
            return total; // Sem desconto
        }
        return estrategiaDesconto.aplicarDesconto(total);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Mercado mercado = new Mercado();
//
//        // Cliente regular
//        mercado.setEstrategiaDesconto(new DescontoClienteRegular());
//        BigDecimal totalRegular = new BigDecimal("100.00");
//        BigDecimal totalComDescontoRegular = mercado.calcularTotalComDesconto(totalRegular);
//        System.out.println("Total com desconto para cliente regular: R$" + totalComDescontoRegular);
//
//        // Cliente VIP
//        mercado.setEstrategiaDesconto(new DescontoClienteVIP());
//        BigDecimal totalVIP = new BigDecimal("100.00");
//        BigDecimal totalComDescontoVIP = mercado.calcularTotalComDesconto(totalVIP);
//        System.out.println("Total com desconto para cliente VIP: R$" + totalComDescontoVIP);
//    }
}
