package SistemaPacket;

class PacoteEmTriagem implements EstadoEntrega {
    public void proximoEstado(Pacote pacote) {
        pacote.setEstado(new PacoteEmRota());
    }
}
