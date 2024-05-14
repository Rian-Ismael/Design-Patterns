public class Gerente implements Papel {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    @Override
    public String getnome() {
        return this.nome;
    }
}