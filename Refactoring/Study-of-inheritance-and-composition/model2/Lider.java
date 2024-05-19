public class Lider implements Papel {
    private String nome;

    public Lider(String nome) {
        this.nome = nome;
    }


    @Override
    public String getnome() {
        return this.nome;
    }
}