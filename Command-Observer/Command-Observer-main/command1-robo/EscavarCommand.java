import java.awt.*;

public class EscavarCommand implements Command{

    private Robo robo;

    public EscavarCommand(Robo robo){
        this.robo = robo;
    }

    @Override
    public void executar() {
        this.robo.escavar();
    }
}
