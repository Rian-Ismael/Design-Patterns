public class RotacionarCommand implements Command{

    private Robo robo;

    public RotacionarCommand(Robo robo){
        this.robo = robo;
    }

    @Override
    public void executar() {
        this.robo.rotacionar();
    }
}
