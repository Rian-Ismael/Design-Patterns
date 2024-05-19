package SistemaPacket;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do sistema de entrega de pacotes

        // Criar um novo pacote
        Pacote pacote = new Pacote();

        // Definir o próximo estado do pacote
        pacote.proximoEstado();

        // Criar o serviço de pacotes
        ServicoPacotes servicoPacotes = new ServicoPacotes();

        // Cadastrar o pacote no serviço
        servicoPacotes.cadastrarPacote(pacote);

        // Obter o pacote do serviço usando o ID (exemplo)
        Pacote pacoteObtido = servicoPacotes.obterPacote(1);
        if (pacoteObtido != null) {
            // Realizar operações com o pacote obtido, se necessário
            System.out.println("Estado do pacote obtido: " + pacoteObtido.getEstado().getClass().getSimpleName());

            // Definir o próximo estado do pacote obtido
            pacoteObtido.proximoEstado();

            // Verificar o estado do pacote após a transição
            System.out.println("Novo estado do pacote: " + pacoteObtido.getEstado().getClass().getSimpleName());
        } else {
            System.out.println("Pacote não encontrado.");
        }
    }
}

