package fabricabolo;

public class FabricaBoloBaunilha extends FabricaBolo {

	public FabricaBoloBaunilha(Cobertura cobertura) {
		super(cobertura);
	}

	@Override
	public void fazerMassa() {
		System.out.println("Faz a massa de baunilha");
	}

}
