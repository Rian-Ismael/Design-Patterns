import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// Classe abstrata para geração de fatura
abstract class GeradorFatura {
    // Template method que define a estrutura geral da geração da fatura
    public void gerarFatura(List<String> itens, List<BigDecimal> precos) {
        gerarCabecalho();
        gerarCorpo(itens, precos);
        gerarRodape();
    }

    // Métodos abstratos que as subclasses devem implementar para personalizar a fatura
    protected abstract void gerarCabecalho();
    protected abstract void gerarRodape();

    // Método concreto que gera o corpo da fatura
    protected void gerarCorpo(List<String> itens, List<BigDecimal> precos) {
        System.out.println("Itens:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i) + " - R$" + precos.get(i));
        }
    }
}

// Subclasse que implementa a geração de fatura para compras no Mercado
class GeradorFaturaMercado extends GeradorFatura {
    @Override
    protected void gerarCabecalho() {
        System.out.println("=== Fatura de Compra ===");
        System.out.println("Mercado XYZ");
        System.out.println("----------------------------");
    }

    @Override
    protected void gerarRodape() {
        System.out.println("----------------------------");
        System.out.println("Total: R$" + calcularTotal());
        System.out.println("Obrigado por sua compra!");
    }

    private BigDecimal calcularTotal() {
        // Simplesmente soma os preços dos itens para calcular o total
        BigDecimal total = BigDecimal.ZERO;
        // Supondo que precos tenha os preços dos itens
        for (BigDecimal preco : precos) {
            total = total.add(preco);
        }
        return total;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        List<String> itens = new ArrayList<>();
//        itens.add("Arroz");
//        itens.add("Feijão");
//        itens.add("Carne");
//
//        List<BigDecimal> precos = new ArrayList<>();
//        precos.add(new BigDecimal("10.00"));
//        precos.add(new BigDecimal("5.00"));
//        precos.add(new BigDecimal("15.00"));
//
//        GeradorFaturaMercado geradorFaturaMercado = new
//    }
}