public class Publicado implements State {

    Documento doc;

    public Publicado(Documento doc){
        this.doc =  doc;
    }

    @Override
    public void publicar() {
        System.out.println("Já esta publicado");
    }

    @Override
    public void getState() {
        System.out.println("Publicado");
    }
}
