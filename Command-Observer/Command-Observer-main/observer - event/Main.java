public class Main {
    public static void main(String[] args) {
        TelefoneListener t1 = new EscutaClandestinaObserver();
        TelefoneListener t2 = new FaxObserver();
        TelefoneListener t3 = new SecretariaEletronicaObserver();

        Telefone telefone = new Telefone();
        telefone.addTelefoneListener(t1);
        telefone.addTelefoneListener(t2);
        telefone.addTelefoneListener(t3);
        telefone.telefoneTocou();
        telefone.removeTElefoneListener(t1);
        telefone.telefoneAtendido();
    }
}