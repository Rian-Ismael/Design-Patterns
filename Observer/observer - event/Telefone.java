import java.util.ArrayList;
import java.util.List;

public class Telefone {

    List<TelefoneListener> listeners = new ArrayList<TelefoneListener>();

    public void addTelefoneListener(TelefoneListener listener) {
        this.listeners.add(listener);
    }

    public void removeTElefoneListener(TelefoneListener listener) {
        this.listeners.remove(listener);
    }

    public void telefoneTocou(){
        for (TelefoneListener listener : listeners) {
            listener.telefoneTocou();
        }
    }

    public void telefoneAtendido(){
        for (TelefoneListener listener : listeners) {
            listener.telefoneAtendido();
        }
    }
}
