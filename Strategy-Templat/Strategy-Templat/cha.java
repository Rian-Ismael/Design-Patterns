public abstract class Bebida {
    // Este é o nosso "template method"
    public final void prepararBebida() {
        esquentarAgua();
        preparar();
        servirEmCopo();
        adicionarExtras();
    }

    private void esquentarAgua() {
        System.out.println("Esquentando a água...");
    }

    // Métodos que devem ser implementados pelas subclasses
    protected abstract void preparar();
    protected abstract void adicionarExtras();

    private void servirEmCopo() {
        System.out.println("Servindo a bebida no copo...");
    }
}

public class Cafe extends Bebida {
    protected void preparar() {
        System.out.println("Moendo e coando o café...");
    }

    protected void adicionarExtras() {
        System.out.println("Adicionando leite e açúcar...");
    }
}

public class Cha extends Bebida {
    protected void preparar() {
        System.out.println("Mergulhando o saquinho de chá na água...");
    }

    protected void adicionarExtras() {
        System.out.println("Adicionando limão...");
    }
}

public class Lanchonete {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe.prepararBebida();

        System.out.println("-------------------");

        Bebida cha = new Cha();
        cha.prepararBebida();
    }
}
