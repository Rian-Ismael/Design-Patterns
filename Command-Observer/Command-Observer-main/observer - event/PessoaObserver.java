public class PessoaObserver implements TelefoneListener{
    @Override
    public void telefoneTocou() {
        System.out.println("Pessoa escuta: Telefone tocou");
    }

    @Override
    public void telefoneAtendido() {
        System.out.println("Pessoa escuta: Telefone atendido");
    }
}
