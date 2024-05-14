package fabricabolo;

public class FabricaBoloChocolate extends FabricaBolo {

	public FabricaBoloChocolate(Cobertura cobertura) {
		super(cobertura);
	}

	@Override
	public void fazerMassa() {
		System.out.println("Faz a massa de chocolate");
	}

}
