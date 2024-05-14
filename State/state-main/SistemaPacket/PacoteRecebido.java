package SistemaPacket;

class PacoteRecebido implements EstadoEntrega {
    public void proximoEstado(Pacote pacote) {
        pacote.setEstado(new PacoteEmTriagem());
    }
}
