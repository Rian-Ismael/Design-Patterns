public class Main {
    public static void main(String[] args) {

        Dev dev = new Dev("Pedro");
        Gerente gerente = new Gerente("Junior");
        Lider lider = new Lider("Jose");

        Sprint sprint = new Sprint(dev, gerente, lider);


        System.out.println(sprint.toString());


        sprint.setGerente(dev);
        System.out.println(sprint.toString());

    }
}
