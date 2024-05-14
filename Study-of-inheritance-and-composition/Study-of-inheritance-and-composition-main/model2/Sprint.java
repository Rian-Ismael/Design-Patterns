public class Sprint {
    private Papel desenvolvedor;
    private Papel gerente;
    private Papel lider;

    public Sprint(Papel desenvolvedor, Papel gerente, Papel lider) {
        this.desenvolvedor = desenvolvedor;
        this.gerente = gerente;
        this.lider = lider;
    }

    public void setDesenvolvedor(Papel desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public void setGerente(Papel gerente) {
        this.gerente = gerente;
    }

    public void setLider(Papel lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        return "Sprint, Equipe: " +
                "desenvolvedor=" + desenvolvedor.getnome() +
                ", gerente=" + gerente.getnome() +
                ", lider=" + lider.getnome();
    }
}