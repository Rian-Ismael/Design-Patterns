### Uma empresa utiliza Sprints, ciclos de desenvolvimento, para a produção de software.
### Os times são compostos de desenvolvedores e um gerente, e a cada Sprint um desenvolvedor assume o papel de líder do time e ACUMULA RESPONSABILIDADES DIFERENTES.
### Nada impede que um desenvolvedor receba uma promoção e vire gerente de um time.


Relacionamentos entre Objetos:

A classe Sprint representa uma sprint de desenvolvimento, que envolve membros da equipe desempenhando diferentes papéis, como desenvolvedor, gerente e líder.
O relacionamento entre a classe Sprint e as outras classes (Dev, Gerente, Lider) é de composição. Isso significa que um objeto da classe Sprint é composto por outros objetos das classes Dev, Gerente e Lider.
Na composição, os objetos das classes Dev, Gerente e Lider são partes integrantes da classe Sprint. Isso significa que eles existem apenas no contexto de uma instância de Sprint e não podem existir independentemente dela.
Quando criamos uma instância de Sprint, fornecemos objetos Dev, Gerente e Lider para representar os membros da equipe para aquela sprint específica.
Manipulação de Papéis:

Durante o teste no main, podemos ver como os papéis podem ser manipulados dentro de uma sprint. Ao criar uma nova instância de Sprint, podemos atribuir diferentes membros da equipe para cada papel.
Isso demonstra a flexibilidade do design em permitir que diferentes desenvolvedores assumam papéis diferentes em diferentes sprints, além da possibilidade de promoção de um desenvolvedor para gerente, por exemplo.
