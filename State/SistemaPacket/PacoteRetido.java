package SistemaPacket;

class PacoteRetido implements EstadoEntrega {
    public void proximoEstado(Pacote pacote) {
        pacote.setEstado(new PacoteDevolvido()); // Apenas para exemplo, poderia ser qualquer próximo estado válido
    }
}
