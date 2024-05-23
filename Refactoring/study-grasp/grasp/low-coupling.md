## Low Coupling (Baixo Acoplamento)

***Acoplamento*** é uma medida de relação ou dependência entre elementos (classe)

***Alto acoplamento***: uma classe que depende de muitas outras
- Mais difícil de entender isoladamente
- Mais difícil de reutilizar (depende das outras classes)
- Sensível a mudanças nas outras classes (gelatina)

### Problema
- Como minimizar dependências e maximizar o reúso ?

### Solução
- Atribuir responsabilidades visando minimizar o acoplamento

### Exemplo do Mercado Fácil
- Como permitir um pagamento associado a uma venda ?

Uma classe ***Pagamento*** associada à classe ***Venda***
- MercadoFacil cria ***Pagamento*** e repassa a ***Venda*** (Creator)

<p align="center">
  <img src="/resources/sol-pagamento.png" alt="vendas">
</p>

<p align="center">
  <img src="/resources/sol-pagamento-sem-creator.png" alt="vendas">
</p>

***Low Coupling***
Consequências
- Uma classe com baixo acoplamento não é afetada (ou é pouco afetada) por mudanças em outras classes
- Simples de entender isoladamente
- Facilita o reúso

---

Baixo acoplamento é o objetivo da maioria dos padrões

Diferente tipos de acoplamento do "pior" ao "melhor":
- Acoplamento de passagem de dados
- Acoplamento de controle
- Acoplamento de dados globais
- Acoplamento de dados internos

## Acoplamento de passagem de dados

O objeto `A` passa dados para `B`
- parâmetros
- Estruturas de dados

Exemplo comum
- Objeto  passa o objeto `X` para `B` (`X` e `B` acoplados)
- Mudanças na interface de `X` pode levar a mudanças em `B`

## Acoplamento de controle

Flags de controle entre objetos
- Um objeto controla etapas de execução de outro objeto

Exemplo comum
- Objeto `A` manda uma mensagem para o objeto `B`
- `B` usa um parâmetro da mensagem para decidir o que fazer

Por exemplo temos uma classe Lampada onde há um método `setLampada`, este irá definir o estado da lâmpada passando como parametro um **valor**, 0 = ligar; 1 = desligar; 2 = piscar. Veja que tudo está e um método só, a solução seria decompor em operações primitivas, uma função para cada operação.

Outro exemplo comum
- Objeto `A` manda mensagem para o objeto `B`
- `B` retorna informações de controle de `A`
- Por exemplo, um código de erro a ser tratado

A solução é utilizar exceções para o tratamento de erros.

## Acoplamento de dados globais

Objetos compartilham estruturas de dados globais
 Acoplamento não direto (escondido)
 - Uma chamada de método altera o dado global e o código não deixa isso evidente

 ## Acoplamento de dados internos

 Um objeto altera dados locais de um objeto

 Problema de encapsulamento
 - Dados píblicos, `package` ou mesmo `protected` (java)