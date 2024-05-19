package fabricabolo;

public abstract class FabricaBolo {
	
	private Cobertura cobertura;
	
	public FabricaBolo(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}
	
	private void levarAoForno() {
		System.out.println("Leva ao forno");
	}
	public void fazerCobertura() {
		this.cobertura.fazerCobertura();
	}
	public abstract void fazerMassa();
	
	private void decorarBolo() {
		System.out.println("Decora bolo");
	}
}
