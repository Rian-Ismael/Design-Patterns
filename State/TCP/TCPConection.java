public class TCPConection {

    State state;

    public TCPConection(){
        this.state = new TCPEstablished(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getState(){
        this.state.getState();
    }

    public void open(){
        this.state.open();
    }

    public void closeAc(){
        this.state.close();
    }

    public void acknowledge(){
        this.state.acknowledge();
    }

}

