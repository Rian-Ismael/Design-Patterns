
public class ItemVenda {
    private int quantidade;
    private Produto produto;
    private Integer idProduto;

    public ItemVenda(int quantidade, Produto produto){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSubTotal(){
        if (this.quantidade>= 100){
            return (this.produto.getPreco() * quantidade) * 0.9;
        }
        return this.produto.getPreco() * quantidade;
    }

}
