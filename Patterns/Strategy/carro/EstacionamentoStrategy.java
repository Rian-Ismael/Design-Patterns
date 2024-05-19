// Classe Estacionamento2
public class Estacionamento2 {
    private Veiculo veiculo;
    private long inicio, fim;

    public double valorConta() {
        long atual = (fim == 0) ? System.currentTimeMillis() : fim;
        long periodo = inicio - atual;
        return veiculo.calcular(periodo);
    }
}

// Classe Passeio
public class Passeio extends Veiculo {
    @Override
    public double calcular(long periodo) {
        ComportamentoCalculo estrategia = new CalculoDiaria();
        double valor = estrategia.calcular(periodo);
        // Processamento adicional conforme regras para veículos de passeio
        return valor;
    }
}

// Classe abstrata Veiculo
public abstract class Veiculo {
    protected ComportamentoCalculo estrategia;

    public abstract double calcular(long periodo);
}

// Interface ComportamentoCalculo
public interface ComportamentoCalculo {
    double calcular(long periodo);
}

// Classe CalculoDiaria
public class CalculoDiaria implements ComportamentoCalculo {
    private static final long HORA = 60;
    private double valorDiaria;

    @Override
    public double calcular(long periodo) {
        return valorDiaria * Math.ceil(periodo / HORA);
    }
}


public class ContaEstacionamento {

private CalculoValor estrategia_calculo;
private Veiculo veiculo;
private long inicio;
private long fim;

public double valorConta() {

    return estrategia_calculo.calcular(fim,inicio,
    veiculo);

}

public void setCalculo(CalculoValor calculo){
    this.estrategia_calculo = calculo;
}

}

public class CalculoDiaria implements CalculoValor {

private double valorDiaria;

public CalculoDiaria(double valorDiaria){
    this.valorDiaria = valorDiaria;
}

public double calcular(...) {
    return valorDiaria * Math.ceil(periodo / HORA);
}

}
