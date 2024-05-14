public class TCPEstablished implements State {

    TCPConection tcpConection;

    public TCPEstablished(TCPConection tcpConection) {
        this.tcpConection= tcpConection;
    }

    @Override
    public void open() {
        this.tcpConection.setState(new TCPListen(this.tcpConection));
    }

    @Override
    public void close() {
        this.tcpConection.setState(new TCPClose(this.tcpConection));
    }

    @Override
    public void acknowledge() {
        System.out.println("AKC");
    }

    public void getState(){
        System.out.println("Established");
    }
}
