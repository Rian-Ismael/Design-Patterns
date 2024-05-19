public abstract class FabricaBolo {

    public void prepararBolo() {
        fazerMassa();
        levarAoForno();
        fazerCobertura();
        decorarBolo();
    }

    public void levarAoForno() {
        System.out.println("Leva ao forno");
    }
    public abstract void fazerCobertura();

    public abstract void fazerMassa();

    public void decorarBolo() {
        System.out.println("Decora bolo");
    }

}

public class FabricaBoloChocolateComCaramelo extends FabricaBolo {

    public void fazerCobertura() {
        System.out.println("Faz cobertura de caramelo");
    }
    public void fazerMassa() {
        System.out.println("Faz a massa de chocolate");
    }

}

public class FabricaBoloBaunilhaComMorango extends FabricaBolo{


    public void fazerCobertura() {
        System.out.println("Faz cobertura de morango");
    }
    public void fazerMassa() {
        System.out.println("Faz a massa de baunilha");
    }

}

//public class Cliente {
//    public static void main(String[] args) {
//        FabricaBoloBaunilhaComMorango fBoloBaunilha = new FabricaBoloBaunilhaComMorango();
//        FabricaBoloChocolateComCaramelo fBoloChocolate = new FabricaBoloChocolateComCaramelo();
//        fBoloBaunilha.prepararBolo();
//        fBoloChocolate.prepararBolo();
//    }
}