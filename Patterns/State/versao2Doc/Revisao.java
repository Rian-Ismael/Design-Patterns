public class Revisao implements State{

    Documento doc;

    public Revisao(Documento doc){
        this.doc =  doc;
    }
    @Override
    public void publicar() {
        if (this.doc.verificaAdm()){
            this.doc.setState(new Publicado(this.doc));
        }else{
            System.out.println("Não é o administrador");
        }
    }

    @Override
    public void getState() {
        System.out.println("Revisão");
    }
}
