

import java.util.HashMap;

public class Imagem implements Visualizacao {

	public void atualizar(HashMap<String, Integer> votosApurados) {
		System.out.println("atualizando imagem...");
		System.out.println(votosApurados.toString());
	}
}
