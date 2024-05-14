public class SecretariaEletronicaObserver implements TelefoneListener{
    @Override
    public void telefoneTocou() {
        System.out.println("Secretaria Eletronica escuta: Telefone tocando");
    }

    @Override
    public void telefoneAtendido() {
        System.out.println("Secretaria Eletronica sabe que foi atendido");
    }
}
