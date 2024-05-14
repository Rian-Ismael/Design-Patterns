public class TCPClose implements State{

    TCPConection tcpConection;

    public TCPClose(TCPConection tcpConection) {
        this.tcpConection= tcpConection;
    }

    @Override
    public void open() {
        System.out.println("Não é possivel abrir uma conexao que já esta fechada");
    }

    @Override
    public void close() {
        System.out.println("Não é possivel fechar uma conexao que já esta fechada");

    }

    @Override
    public void acknowledge() {
        System.out.println("Não é possivel AKC em uma conexao que já esta fechada");
    }

    @Override
    public void getState() {
        System.out.println("Closing connection");
    }
}
