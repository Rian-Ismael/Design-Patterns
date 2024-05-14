package Doc;

public class Main {
    public static void main(String[] args) {
        // Criando o serviço de gerenciamento de documentos
        DocumentoService documentoService = new DocumentoService();
        Usuario user = new Usuario();

        // Adicionando um documento e publicando-o
        Documento doc1 = new Documento();
        documentoService.adicionarDocumento(doc1);
        doc1.publicar();

        // Adicionando outro documento e publicando-o (após revisão bem-sucedida)
        Documento doc2 = new Documento();
        documentoService.adicionarDocumento(doc2);
        doc2.publicar(); // Isso não publicará porque o usuário não é administrador

        // Simulando revisão por um administrador
        user.setAdmin(true);
        doc2.publicar(); // Isso agora deverá publicar o documento

        // Adicionando mais documentos e publicando-os
        Documento doc3 = new Documento();
        documentoService.adicionarDocumento(doc3);
        doc3.publicar();

        Documento doc4 = new Documento();
        documentoService.adicionarDocumento(doc4);
        doc4.publicar();

        // Obtendo um documento por ID
        Documento documentoObtido = documentoService.obterDocumento(2);
        if (documentoObtido != null) {
            System.out.println("Documento obtido: ID " + documentoObtido.getId());
        } else {
            System.out.println("Documento não encontrado.");
        }
    }
}
