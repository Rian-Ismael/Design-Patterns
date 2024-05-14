public class Documento {
    State state;
    Boolean isAdm;

    public Documento(Boolean isAdm) {
        this.state = new Rascunho(this);
        this.isAdm = isAdm;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publicar(){
        this.state.publicar();
    }

    public boolean verificaAdm() {
        return this.isAdm;
    }

    public void getState(){
        this.state.getState();
    }
}
