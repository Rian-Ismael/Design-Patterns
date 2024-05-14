public class MoverCommand implements Command {

    private Robo robo;

    public MoverCommand(Robo robo) {
        this.robo = robo;
    }

    @Override
    public void executar() {
        this.robo.mover();
    }
}
