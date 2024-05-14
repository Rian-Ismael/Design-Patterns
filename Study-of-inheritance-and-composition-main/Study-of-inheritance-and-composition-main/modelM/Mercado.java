import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Mercado {
    private HashMap<Integer, Produto> produtos;
    private HashMap<Integer, Venda> vendas;
    private int contadorVenda;
    private int contadorProduto;

    public Mercado(){
        this.produtos = new HashMap();
        this.vendas = new HashMap();
        this.contadorVenda = 0;
        this.contadorProduto = 0;
    }

    public int criarVenda(Date data){
        vendas.put(contadorVenda, new Venda(data));
        return ++contadorVenda;
    }

    public  int adicionarProdutoMercado(String nome, String descricao, double valor){
        produtos.put(contadorProduto, new Produto(nome,descricao,valor));
        return  ++contadorProduto;
    }
    
    public void criarItemVenda(int idProduto, int quantidade, int idVenda){
        Produto produto = produtos.get(idProduto);
        Venda venda = vendas.get(idVenda);
        venda.adicionarItem(quantidade, produto);
    }

    public void fazerPagamento(int idVenda, String nomePagador){
        Venda venda = vendas.get(idVenda);
        venda.fazerPagamento(venda.getTotal() , nomePagador);
    }

}
