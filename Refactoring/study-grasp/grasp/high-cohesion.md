## High Cohesion

### Problema

Como gerenciar complexidade ?
- Responsabilidade no lugar certo ? 
- Funcionalidades implementadas nas classes corretas ?

### Solução
Buscar alta coesão pela atribuição de responsabilidades

Classes com responsabilidades não relacionadas são:
- Mais difíceis de entender
- Mais complicadas para manter e reusar
- Mais impactadas por mudanças em outras classes

---

Exemplo de MercadoFacil criando ***Pagamento*** (Creator)

Isso pode ocorrer também para outras classes

MercadoFacil acumula responsabilidades não relacionadas
- Baixa coesão!

<p align="center">
  <img src="/resources/venda-mercadofacil.png" alt="vendas">
</p>

Delegar `fazerPagamento()` aumenta a coesão

<p align="center">
  <img src="/resources/venda-fazerpagamento.png" alt="vendas">
</p>

***High Cohesion***
Consequências
- Maior facilidade de compreensão do projeto
- Simplificação da manutenção do código
- Relação positiva com o baixo acoplamento