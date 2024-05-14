public class RoboController {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executarCommand(){
        this.command.executar();
    }
}
