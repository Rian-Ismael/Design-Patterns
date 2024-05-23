## Problema:

Imagine que você está desenvolvendo um sistema de processamento de pedidos para uma loja online. Neste sistema, há a necessidade de calcular o preço total de um pedido, que pode conter vários itens diferentes, como roupas, eletrônicos, e outros produtos.

Além disso, o sistema também precisa aplicar descontos especiais com base em várias condições, como cupons de desconto, promoções sazonais, descontos para clientes premium, entre outros.

### Por que aplicar o padrão Low Coupling:

- Flexibilidade e extensibilidade: Ao usar o padrão Low Coupling, você pode garantir que o cálculo do preço total do pedido não esteja diretamente acoplado às classes de produtos ou aos mecanismos de desconto. Isso significa que você pode facilmente adicionar novos tipos de produtos ou regras de desconto sem precisar alterar a lógica de cálculo do preço total. Por exemplo, se uma nova categoria de produtos for adicionada, ou se novas regras de desconto forem introduzidas, você pode implementar essas mudanças sem afetar a classe responsável pelo cálculo do preço total do pedido.

- Facilidade de manutenção: Ao reduzir o acoplamento entre diferentes partes do sistema, você torna o código mais fácil de entender, manter e modificar. Se a lógica de cálculo do preço total estivesse intimamente ligada às classes de produtos ou aos mecanismos de desconto, qualquer mudança nessas partes poderia exigir modificações extensas na lógica de cálculo. Com o baixo acoplamento, as mudanças podem ser feitas de forma mais isolada e com menor risco de introduzir erros ou efeitos colaterais indesejados.

- Reutilização de código: O baixo acoplamento promove a reutilização de código, pois as diferentes partes do sistema são menos dependentes umas das outras. Por exemplo, se houver necessidade de calcular o preço total do pedido em um contexto diferente, como em um sistema de vendas no ponto de venda físico da loja, a mesma lógica de cálculo pode ser reutilizada sem precisar trazer consigo as classes de produtos ou os mecanismos de desconto específicos do sistema online.

Portanto, aplicar o padrão Low Coupling neste cenário tornaria o sistema mais flexível, fácil de manter e promoveria a reutilização de código, uma vez que a lógica de cálculo do preço total do pedido estaria desacoplada das classes de produtos e dos mecanismos de desconto. Isso permitiria adaptar o sistema a mudanças futuras com maior agilidade e menor impacto em outras partes do código.

Imagine um sistema de comércio eletrônico onde há uma classe responsável por calcular o preço total de um carrinho de compras. Em vez de a classe de cálculo depender diretamente das classes de produtos específicos, ela recebe as informações de preço e quantidade de forma genérica, minimizando o acoplamento entre os diferentes módulos do sistema.

```java
import java.util.ArrayList;
import java.util.List;

// Classe Produto que representa um produto no carrinho de compras
class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters para acessar informações do produto
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

// Classe CarrinhoDeCompras responsável por calcular o preço total do carrinho
class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para calcular o preço total do carrinho
    public double calcularPrecoTotal() {
        double precoTotal = 0;
        for (Produto produto : produtos) {
            precoTotal += produto.getPreco() * produto.getQuantidade();
        }
        return precoTotal;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Camiseta", 29.99, 2);
        Produto produto2 = new Produto("Calça", 39.99, 1);

        // Criando um carrinho de compras e adicionando produtos
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        // Calculando o preço total do carrinho
        double precoTotal = carrinho.calcularPrecoTotal();
        System.out.println("Preço total do carrinho: R$" + precoTotal);
    }
}
```
Neste exemplo, a classe CarrinhoDeCompras é responsável por calcular o preço total do carrinho. Ela não depende diretamente das classes de produtos específicos, como Camiseta ou Calça, mas sim das informações de preço e quantidade fornecidas de forma genérica pela classe Produto. Isso demonstra baixo acoplamento entre a classe CarrinhoDeCompras e as classes de produtos específicos, o que torna o sistema mais flexível e fácil de manter.


