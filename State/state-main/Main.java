public class Main {
    public static void main(String[] args) {

        TCPConection conexao = new TCPConection();
        conexao.getState();

        conexao.open();
        conexao.acknowledge();
        conexao.getState();

        conexao.closeAc();
        conexao.open();
        conexao.acknowledge();
        conexao.getState();





    }
}