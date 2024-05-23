## Information Expert

Princípio fundamental para atribuir responsabilidades
- Quem é o especialista da informação envolvida na operação ?

### Problema
- A qual classe deve ser atribuída uma responsabilidade ?

### Exemplo:
- Qual classe deve ser responsável por saber / informar o total de uma venda ?

<p align="center">
  <img src="/resources/vendas.png" alt="vendas">
</p>

### Solução:
- A classe que possui a ***informação necessária*** para realizar a operação.

<p align="center">
  <img src="/resources/total-vendas.png" alt="vendas">
</p>

Qual classe deve saber o total de uma venda ?
- A classe ***Venda** é o especialista

Uma possição solução, mas não viável, é criar uma dependência entre Venda e Produto, fazendo com o que cada item fizesse parte do total

<p align="center">
  <img src="/resources/vendas-nao-viavel.png.png" alt="vendas">
</p>

Information Expert: O especialista de cada parte é ***ItemVenda***
- Cada parte tem um subtotal

<p align="center">
  <img src="/resources/vendas-expert.png" alt="vendas">
</p>

---

<!-- ## Evoluindo o sistema

Cálculo do item de venda vai considerar um desconto

- Quantidade de produtos maior que 200
- Desconto de até 20% no valor do item de venda
- O desconto depende do item de venda

Onde o desconto deve ser calculado? 

Quem deve manter a informação do valor de desconto?

Seria natural considerar um atributo de produto
- Desconto depende do item de venda e não do produto -->

***Expert***
Consequências
- Encapsulamento é mantido
- Baixo acoplamento e facilidade de manutenção
- Alta coesão: Objetos realizam operações com base nas informações que possuem.

