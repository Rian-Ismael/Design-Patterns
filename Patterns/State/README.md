Problema:
  - Adição de novos estados e comportamentos do documento
  - Manutenção complexa do código 
  - Baixa legibilidade do código
  - Complexidade em atualizar e modificar as condicionais
  - Mudanças na lógica de transição impacta diretamente as condicionais
  - O problema tende a aumentar com a evolução do projeto
  - Difícil antecipar possíveis estados e transições no início do projeto

Padrão:
  - Criar novas classes para modelar / implementar os estados
  - Mover os comportamentos específicos dos estados para as novas classes
  - A classe principal não implementa o comportamento
  - Delega essa responsabilidade para um atributo da classe estado
  - Cada tipo de estado implementa um comportamento específico
  - Os estados implementam as transições

Consequência:
  - Um objeto altera seu comportamento quando seu estado muda
  - Parece que o objeto muda de classe
  - Facilita a mudança de um estado e a adição de novos 
  - Comportamento e transições isoladas na hierarquia de estados
  - Composição em vez de herança de implementação
  - Transições realizadas pelos próprios estados (diferente do strategy)
  - Ponto negativo: aumento no acoplamento entre as subclasses
  - Elas precisam se conhecer para realizar as transições de estado
