package SistemaPacket;

class PacoteEmRota implements EstadoEntrega {
    public void proximoEstado(Pacote pacote) {
        pacote.setEstado(new PacoteRetido()); // Apenas para exemplo, poderia ser qualquer próximo estado válido
    }
}
