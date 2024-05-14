
public class Pagamento {
    private Double valor;
    private String nomePagante;

    public Pagamento(double valor, String nome){
        this.valor = valor;
        this.nomePagante = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
