package Doc;

import java.util.HashMap;
import java.util.Map;

public class DocumentoService {
    private Map<Integer, Documento> documentos;
    private int proximoId;

    public DocumentoService() {
        this.documentos = new HashMap<>();
        this.proximoId = 1;
    }

    public void adicionarDocumento(Documento doc) {
        int id = proximoId++;
        doc.setId(id);
        documentos.put(id, doc);
        System.out.println("Documento adicionado com ID: " + id);
    }

    public Documento obterDocumento(int id) {
        return documentos.get(id);
    }
}
