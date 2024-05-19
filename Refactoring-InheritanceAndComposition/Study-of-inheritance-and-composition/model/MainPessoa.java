public class MainPessoa {
    public static void main(String[] args) {
        Tripulante tripulante = new Tripulante(1);
        Agente agente = new Agente(2);
        Pessoa pessoa = new Pessoa("Junior", tripulante);
        System.out.println(pessoa.toString());
        pessoa.setPapel(agente);
        System.out.println(pessoa.toString());

    }
}