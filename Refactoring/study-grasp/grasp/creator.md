## Creator

### Problema
- Quem deve criar novas instâncias de uma classe ?

### Exemplo do Mercado Fácil
- Qual classe deve ser responsável por criar instâncias de ItemVenda ?

Atribuir a uma clase `A` a responsabilidade de criar instâncias da classe `B` se:
- `A` contém objetos de `B`
- `A` registra instâncias de `B`
- `A` usa muitos objetos da classe `B`
- `A` possui os dados de inicialização de `B`

**Venda agrega vários ItemVenda**
**ItemVenda só existem em Venda**
<p align="center">
  <img src="/resources/vendas-instancia.png" alt="vendas">
</p>

Método ***adicionarItemVenda*** em ***Venda***
- cria uma instância de ItemVenda

```java
public void adicionarItemVenda (int quantidade) {
    this.itens.add(new ItemVenda(quantidade));
}
```

***Creator***
Consequências
- Baixo acoplamento
- venda já estaria acoplado com ItemVenda de toda forma