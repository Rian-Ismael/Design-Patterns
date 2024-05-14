public interface State {

    void open();
    void close();
    void acknowledge();
    void getState();
}
