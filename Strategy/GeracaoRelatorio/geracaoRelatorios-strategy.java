import java.util.List;

// Classe abstrata para geração de relatórios
abstract class GeradorRelatorio {
    // Template method que define a estrutura geral da geração de relatórios
    public void gerarRelatorio(List<String> dados) {
        formatarCabecalho();
        formatarCorpo(dados);
        formatarRodape();
    }

    // Métodos abstratos que as subclasses devem implementar para personalizar o relatório
    protected abstract void formatarCabecalho();
    protected abstract void formatarRodape();

    // Método concreto que formata o corpo do relatório
    protected void formatarCorpo(List<String> dados) {
        System.out.println("Conteúdo do relatório:");
        for (String item : dados) {
            System.out.println(item);
        }
    }
}

// Subclasse que implementa a geração de relatórios em PDF
class GeradorRelatorioPDF extends GeradorRelatorio {
    @Override
    protected void formatarCabecalho() {
        System.out.println("===== Cabeçalho do Relatório em PDF =====");
    }

    @Override
    protected void formatarRodape() {
        System.out.println("===== Rodapé do Relatório em PDF =====");
    }
}

// Subclasse que implementa a geração de relatórios em CSV
class GeradorRelatorioCSV extends GeradorRelatorio {
    @Override
    protected void formatarCabecalho() {
        System.out.println("Cabeçalho do Relatório em CSV");
    }

    @Override
    protected void formatarRodape() {
        System.out.println("Rodapé do Relatório em CSV");
    }
}

// Subclasse que implementa a geração de relatórios em HTML
class GeradorRelatorioHTML extends GeradorRelatorio {
    @Override
    protected void formatarCabecalho() {
        System.out.println("<html><head><title>Relatório HTML</title></head><body>");
    }

    @Override
    protected void formatarRodape() {
        System.out.println("</body></html>");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        List<String> dadosRelatorio = List.of("Item 1", "Item 2", "Item 3");
//
//        // Geração de relatório em PDF
//        GeradorRelatorio geradorPDF = new GeradorRelatorioPDF();
//        geradorPDF.gerarRelatorio(dadosRelatorio);
//
//        System.out.println();
//
//        // Geração de relatório em CSV
//        GeradorRelatorio geradorCSV = new GeradorRelatorioCSV();
//        geradorCSV.gerarRelatorio(dadosRelatorio);
//
//        System.out.println();
//
//        // Geração de relatório em HTML
//        GeradorRelatorio geradorHTML = new GeradorRelatorioHTML();
//        geradorHTML.gerarRelatorio(dadosRelatorio);
//    }
}
