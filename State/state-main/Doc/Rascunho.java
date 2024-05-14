package Doc;

public class Rascunho implements Estado {
    @Override
    public void publicar(Documento doc) {
        System.out.println("Documento publicado como Rascunho");
        doc.setEstado(new Revisao());
    }
}
