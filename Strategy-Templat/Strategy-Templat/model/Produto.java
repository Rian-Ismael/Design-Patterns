
public class Produto {
    private String nome;
    private Double preco;
    private String descricao;


    public Produto(String nome, String descricao, Double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }
}

