package Doc;

public class Revisao implements Estado {

    Usuario user = new Usuario();

    @Override
    public void publicar(Documento doc) {
        user.setAdmin(true);
        if (user.isAdmin()) {
            System.out.println("Documento publicado após revisão");
            doc.setEstado(new Publicado());
        } else {
            System.out.println("Somente administradores podem publicar o documento após revisão");
        }
    }
}
