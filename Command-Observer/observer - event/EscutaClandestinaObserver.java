public class EscutaClandestinaObserver implements TelefoneListener{
    @Override
    public void telefoneTocou() {
        System.out.println("Escuta clandestina escuta tocando");
    }

    @Override
    public void telefoneAtendido() {
        System.out.println("Escuta clandestina sabe que foi atendido");
    }
}
