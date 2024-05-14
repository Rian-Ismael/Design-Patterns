


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultadoVotacao {
	
	private HashMap<String,Integer> votosApurados;
	List<Visualizacao> visualizacoes = new ArrayList<Visualizacao>();
	
	public void adicionarVisualizacao(Visualizacao vis) {
		this.visualizacoes.add(vis);
	}
	
	public void atualizarVotos(HashMap<String, Integer> votosApurados) {
		this.votosApurados = votosApurados;
		notificarVisualizacoes();
	}
	
	public void notificarVisualizacoes() {
		for (Visualizacao visualizacao : visualizacoes) {
			visualizacao.atualizar(votosApurados); // só print
		}
	}


}