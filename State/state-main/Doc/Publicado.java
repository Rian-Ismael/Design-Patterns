package Doc;

public class Publicado implements Estado {
    @Override
    public void publicar(Documento doc) {
        System.out.println("Documento já está publicado");
        // Nada acontece, pois o documento já está publicado
    }
}
