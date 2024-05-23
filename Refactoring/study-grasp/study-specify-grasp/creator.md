## Problema:

Suponha que você esteja desenvolvendo um sistema de gerenciamento de uma loja online. Nesse sistema, você precisa lidar com a criação de objetos Produto com frequência. Cada produto tem um nome e um preço.

Você percebe que a lógica para criar um produto é relativamente simples, mas pode se tornar mais complexa à medida que novos requisitos surgem. Além disso, pode haver a necessidade de adicionar validações ou lógica adicional durante a criação de um produto.

### Por que aplicar o padrão Creator:

- Separação de responsabilidades: Ao usar o padrão Creator, você pode separar a lógica de criação de objetos Produto em uma classe dedicada, como FabricaDeProdutos. Isso mantém o código organizado e segue o princípio de responsabilidade única, onde cada classe tem uma única responsabilidade.

- Flexibilidade e manutenibilidade: Com o padrão Creator, você pode facilmente modificar a lógica de criação de objetos Produto sem afetar as classes que os utilizam. Por exemplo, se novas regras de negócio surgirem, como a necessidade de validar os dados do produto durante a criação, você pode fazer essas alterações na fábrica de produtos sem alterar o código em outros lugares.

- Encapsulamento: O padrão Creator permite encapsular a lógica de criação de objetos em uma única classe. Isso ajuda a ocultar os detalhes de implementação da criação de objetos dos consumidores, promovendo uma interface mais limpa e fácil de usar.

- Reutilização de código: Ao centralizar a criação de objetos em uma fábrica dedicada, você promove a reutilização de código. Outras partes do sistema que precisam criar produtos podem simplesmente chamar os métodos da fábrica em vez de reimplementar a lógica de criação.

Dessa forma, aplicar o padrão Creator torna o código mais organizado, flexível, fácil de manter e promove a reutilização de código.


O padrão Creator visa definir quem deve ser responsável pela criação de novas instâncias de objetos. Aqui está um exemplo em Java demonstrando o padrão Creator:

```java
// Classe Produto
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Classe Fábrica de Produtos
class FabricaDeProdutos {
    // Método para criar uma instância de Produto
    public static Produto criarProduto(String nome, double preco) {
        // Lógica para criar um produto
        return new Produto(nome, preco);
    }
}

public class Main {
    public static void main(String[] args) {
        // Usando a fábrica para criar um produto
        Produto produto1 = FabricaDeProdutos.criarProduto("Camisa", 29.99);
        Produto produto2 = FabricaDeProdutos.criarProduto("Calça", 39.99);

        // Imprimindo os produtos criados
        System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco());
        System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco());
    }
}
```

Neste exemplo, a classe Produto representa um produto comum com um nome e um preço. A classe FabricaDeProdutos é responsável pela criação de instâncias de Produto. O método criarProduto() na fábrica cria e retorna novas instâncias de Produto com base nos parâmetros fornecidos.

Isso segue o padrão Creator, onde a responsabilidade de criar novas instâncias de Produto é delegada à classe FabricaDeProdutos, separando assim a lógica de criação de objetos de suas classes consumidoras.

