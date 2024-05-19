public class Main {
    public static void main(String[] args) {

        Documento documento = new Documento(true);
        documento.getState();

        documento.publicar();
        documento.getState();

        documento.publicar();
        documento.getState();

        documento.publicar();
        documento.getState();

    }
}