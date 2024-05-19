public class TCPListen implements State{

    TCPConection tcpConection;

    public TCPListen(TCPConection tcpConection) {
        this.tcpConection= tcpConection;
    }

    @Override
    public void open() {
        System.out.println("Conexão já esta escutando");
    }

    @Override
    public void close() {
        this.tcpConection.setState(new TCPClose(this.tcpConection));
    }

    @Override
    public void acknowledge() {
        System.out.println("ACK");
    }

    @Override
    public void getState() {
        System.out.println("Listening on TCP");
    }
}
