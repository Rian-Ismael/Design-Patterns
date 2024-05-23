## Problema:

Imagine que você está desenvolvendo um sistema de gerenciamento de uma biblioteca. Neste sistema, há a necessidade de calcular a multa para um livro com base em informações como a data de devolução e a data de entrega. A lógica para calcular a multa pode se tornar complexa, envolvendo cálculos de dias de atraso, taxas de multa variáveis, entre outros aspectos.

### Por que aplicar o padrão Information Expert:

- Encapsulamento de conhecimento: O padrão Information Expert sugere atribuir a responsabilidade a quem possui as informações necessárias para executá-la. Neste caso, a classe Livro possui as informações relevantes, como a data de devolução e a data de entrega, para calcular a multa associada a um livro específico. Portanto, faz sentido que a responsabilidade de calcular a multa seja atribuída à classe Livro, pois ela detém as informações necessárias para isso.

- Alta coesão: Ao atribuir a responsabilidade de calcular a multa à classe Livro, promove-se alta coesão dentro da classe. Isso significa que a classe Livro terá uma única responsabilidade bem definida: gerenciar informações relacionadas ao livro, incluindo o cálculo de multas.

- Manutenibilidade: Ao seguir o padrão Information Expert, o código se torna mais fácil de manter, pois a lógica de cálculo da multa está encapsulada na classe Livro. Se houver mudanças nos requisitos relacionados ao cálculo de multas, essas alterações podem ser feitas diretamente na classe Livro, sem afetar outras partes do sistema.

- Encapsulamento de complexidade: A lógica de cálculo da multa pode ser complexa e envolver várias considerações. Ao encapsular essa lógica na classe Livro, você oculta essa complexidade dos consumidores da classe, promovendo uma interface mais simples e limpa.

Portanto, aplicar o padrão Information Expert neste cenário tornaria o código mais coeso, fácil de manter e alinhado com o princípio de encapsulamento de conhecimento, pois a classe Livro é a especialista em calcular a multa associada a um livro específico.

```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Classe Livro que representa um livro na biblioteca
class Livro {
    private String titulo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoEfetiva;

    public Livro(String titulo, LocalDate dataDevolucaoPrevista) {
        this.titulo = titulo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    // Método para registrar a data de devolução efetiva
    public void registrarDevolucao(LocalDate dataDevolucaoEfetiva) {
        this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
    }

    // Método para calcular a multa com base nas datas de devolução
    public double calcularMulta(double valorPorDiaDeAtraso) {
        if (dataDevolucaoEfetiva.isAfter(dataDevolucaoPrevista)) {
            long diasDeAtraso = ChronoUnit.DAYS.between(dataDevolucaoPrevista, dataDevolucaoEfetiva);
            return diasDeAtraso * valorPorDiaDeAtraso;
        }
        return 0;
    }

    // Getters para acessar informações do livro
    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoEfetiva() {
        return dataDevolucaoEfetiva;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um livro e registrando a devolução efetiva
        Livro livro = new Livro("Dom Casmurro", LocalDate.of(2024, 2, 20));
        livro.registrarDevolucao(LocalDate.of(2024, 2, 25));

        // Calculando a multa com base nas datas de devolução
        double multa = livro.calcularMulta(0.5); // 0.5 é o valor da multa por dia de atraso
        System.out.println("Multa para o livro " + livro.getTitulo() + ": R$" + multa);
    }
}
```

Neste exemplo, a classe Livro representa um livro na biblioteca, com atributos como título, data de devolução prevista e data de devolução efetiva. A classe Livro é responsável por calcular a multa associada ao atraso na devolução do livro. Isso segue o padrão Information Expert, pois a classe Livro detém as informações relevantes para calcular a multa e é a especialista em realizar essa tarefa.