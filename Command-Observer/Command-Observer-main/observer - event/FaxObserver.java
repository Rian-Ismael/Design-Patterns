public class FaxObserver implements TelefoneListener{
    @Override
    public void telefoneTocou() {
        System.out.println("Fax Observer: telefone tocou");
    }

    @Override
    public void telefoneAtendido() {
        System.out.println("Fax Observer: telefone atendido");
    }
}
