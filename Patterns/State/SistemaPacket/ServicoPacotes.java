package SistemaPacket;

import java.util.HashMap;
import java.util.Map;

class ServicoPacotes {
    private Map<Integer, Pacote> pacotes;
    private int id;

    public ServicoPacotes() {
        this.pacotes = new HashMap<>();
        this.id = 0;
    }

    public void cadastrarPacote(Pacote pacote) {
        int pacoteId = incrementaId();
        pacotes.put(pacoteId, pacote);
    }

    public Pacote obterPacote(int idDoPacote) {
        return pacotes.get(idDoPacote);
    }

    private int incrementaId() {
        return ++id;
    }
}
