package fabricabolo;

public class Cliente {
	public static void main(String[] args) {
		FabricaBolo fabrica = new FabricaBoloBaunilha(new CobeturaMorango());
		fabrica.prepararBolo();
		
		fabrica = new FabricaBoloChocolate(new CoberturaCaramelo());
		fabrica.prepararBolo();
		
		fabrica.setCobertura(new CobeturaMorango());
		fabrica.prepararBolo();
		
	}
}
