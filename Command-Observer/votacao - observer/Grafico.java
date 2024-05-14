public class Grafico implements RepresentacaoVotacao{
    private int votos;
    @Override
    public void update(int votos) {
        this.votos = votos;
    }
}
