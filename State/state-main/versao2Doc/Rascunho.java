public class Rascunho implements State{

    Documento doc;

    public Rascunho(Documento doc){
        this.doc =  doc;
    }

    @Override
    public void publicar() {
        doc.setState(new Revisao(this.doc));
    }

    @Override
    public void getState() {
        System.out.println("Rascunho");
    }
}
