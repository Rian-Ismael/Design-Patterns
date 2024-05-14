public class Main {
    public static void main(String[] args) {

        Robo robo = new Robo();
        Command command = new EscavarCommand(robo);
        Command command1 = new MoverCommand(robo);

        RoboController rc = new RoboController();
        rc.setCommand(command);
        rc.executarCommand();
        rc.setCommand(command1);
        rc.executarCommand();

    }
}