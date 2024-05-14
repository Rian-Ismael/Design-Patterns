package Doc;

public class Documento {
    private Estado estado;
    private int id;

    public Documento() {
        this.estado = new Rascunho();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void publicar() {
        estado.publicar(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
