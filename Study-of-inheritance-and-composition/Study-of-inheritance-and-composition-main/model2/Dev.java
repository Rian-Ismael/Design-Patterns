public class Dev implements Papel{
    private String nome;
    public Dev(String nome) {
        this.nome = nome;
    }
    @Override
    public String getnome() {
        return this.nome;
    }
}