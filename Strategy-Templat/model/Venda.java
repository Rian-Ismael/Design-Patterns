import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private Date dataVenda;
    private  ArrayList<ItemVenda> itemVenda;
    private ArrayList<Pagamento> pagamentos;

    public Venda(Date dataVenda){
        this.dataVenda = dataVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getTotal(){
        Double total = 0.0;
        for (ItemVenda item: this.itemVenda){
            total += item.getSubTotal();
        }
        return total;
    }

    public void adicionarItem(int quantidade, Produto produto){
        this.itemVenda.add(new ItemVenda(quantidade, produto));
    }

    public void fazerPagamento(double valor, String nomePagador){
        pagamentos.add(new Pagamento(valor, nomePagador));
    }
}
