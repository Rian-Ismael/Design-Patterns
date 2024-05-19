# Study-of-inheritance-and-composition

herança --> é quando você tem uma relação de classe mãe e filha. Quando uma classe herda de outra , ela no contexto é a filha ou subclasse. Ela terá como obrigação a implementação de todos módulos da mãe e também terá os atributos A herança permite você na classe filha a definição de novos atributos e métodos. A grande vantagem disso é não ter que partir do zero para especializar uma classe existente e você reutiliza código.

composição --> A composição usa o termo TEM UM. Por exemplo, podemos dizer que um cliente TEM UMA conta. É um conceito de extensão de uma classe, de composição de objetos de maneira que as classes separadas compõe um objeto todo.
"Mas a composição, por sua vez, é a transferência de trabalho para outra classe, ou seja, você delega um objeto como parte da composição de outra classe. No exemplo dado em aula, o professor, inicialmente, passou os atributos da classe Cliente na classe Conta:""

## Testes:

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


public class FilmeTest {


    private Filme filmeBase;


    @BeforeEach

    void preparaFilmes() {

        this.filmeBase = new Filme("Avatar", "2009", "Disney+");

    }


    @Test

    void testNomeAno() {

       String msg = "Esperando Nome e Ano";

       assertEquals( "Avatar, 2009", this.filmeBase.nomeAno(), msg);

    }

}
