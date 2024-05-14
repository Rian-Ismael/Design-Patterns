import java.util.List;

public class ResultadoVotacao {

    private List<RepresentacaoVotacao> representacaoVotacaos;

    public void addRepresentacaoVotacao(RepresentacaoVotacao rep) {
        this.representacaoVotacaos.add(rep);
    }

    public void removeRepresentacaoVotacao(RepresentacaoVotacao rep) {
        this.representacaoVotacaos.remove(rep);
    }

    public void notifyObserver(int votos){
        for (RepresentacaoVotacao rep : this.representacaoVotacaos) {
            rep.update(votos);
        }
    }
}
