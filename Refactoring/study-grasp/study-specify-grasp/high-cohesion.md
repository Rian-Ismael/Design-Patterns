## Problema:

Suponha que você esteja desenvolvendo um sistema de gerenciamento de uma escola. Neste sistema, há a necessidade de uma classe responsável por gerenciar informações sobre os alunos, incluindo nome, idade, notas, presença em aulas, e outras informações pertinentes.

### Por que aplicar o padrão High Cohesion:

Coesão Funcional: Ao projetar a classe responsável por gerenciar informações sobre os alunos, é importante garantir que ela tenha alta coesão funcional. Isso significa que a classe deve ter uma única responsabilidade bem definida e todas as suas operações devem estar relacionadas a essa responsabilidade.

Facilidade de Manutenção: Uma classe com alta coesão funcional é mais fácil de entender, manter e modificar. Por exemplo, se houver a necessidade de adicionar um novo método para calcular a média das notas dos alunos, é mais natural incluir esse método na classe responsável por gerenciar informações sobre os alunos, em vez de dispersá-lo por várias partes do sistema.

Reusabilidade de Código: Classes com alta coesão funcional tendem a promover a reusabilidade de código. Outras partes do sistema podem utilizar facilmente os métodos e atributos da classe responsável por gerenciar informações sobre os alunos sem preocupação com funcionalidades desnecessárias ou mal relacionadas.

Encapsulamento de Funcionalidade Relacionada: Ao manter operações relacionadas juntas em uma única classe, você promove o encapsulamento de funcionalidade relacionada. Isso torna o código mais modular e fácil de entender, pois as operações que lidam com informações sobre os alunos estão agrupadas logicamente em um só lugar.

Portanto, aplicar o padrão High Cohesion neste cenário garantiria que a classe responsável por gerenciar informações sobre os alunos tenha uma única responsabilidade bem definida e todas as suas operações estejam relacionadas a essa responsabilidade. Isso tornaria o sistema mais fácil de manter, promoveria a reusabilidade de código e garantiria que a funcionalidade relacionada estivesse encapsulada de forma eficaz.

```java
import java.util.ArrayList;
import java.util.List;

// Classe Aluno que representa um aluno na escola
class Aluno {
    private String nome;
    private int idade;
    private List<Double> notas;
    private List<Boolean> presenca;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.notas = new ArrayList<>();
        this.presenca = new ArrayList<>();
    }

    // Método para adicionar uma nota
    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    // Método para adicionar presença
    public void registrarPresenca(boolean presente) {
        presenca.add(presente);
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return notas.isEmpty() ? 0 : soma / notas.size();
    }

    // Método para calcular a frequência do aluno
    public double calcularFrequencia() {
        long presencas = presenca.stream().filter(p -> p).count();
        return presenca.isEmpty() ? 0 : (double) presencas / presenca.size();
    }

    // Getters para acessar informações do aluno
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("João", 18);

        // Adicionando notas e registrando presença
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.0);
        aluno.registrarPresenca(true);
        aluno.registrarPresenca(false);

        // Calculando a média das notas e a frequência do aluno
        double media = aluno.calcularMedia();
        double frequencia = aluno.calcularFrequencia();

        // Imprimindo informações do aluno
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Média das Notas: " + media);
        System.out.println("Frequência: " + (frequencia * 100) + "%");
    }
}
```

Neste exemplo, a classe Aluno é responsável por gerenciar informações sobre os alunos, incluindo nome, idade, notas e presença em aulas. A classe possui métodos para adicionar notas, registrar presença, calcular a média das notas e calcular a frequência do aluno. Todas essas operações estão relacionadas à responsabilidade de gerenciar informações sobre os alunos, garantindo assim alta coesão funcional na classe.