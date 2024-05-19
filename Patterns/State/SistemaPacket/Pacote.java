package SistemaPacket;

public class Pacote {
    private EstadoEntrega estado;

    public Pacote() {
        this.estado = new PacoteRecebido(); // Estado inicial
    }

    public void setEstado(EstadoEntrega estado) {
        this.estado = estado;
    }

    public void proximoEstado() {
        estado.proximoEstado(this);
    }

    public EstadoEntrega getEstado() {
        return this.estado;
    }
}
