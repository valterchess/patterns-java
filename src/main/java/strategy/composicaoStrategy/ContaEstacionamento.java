package main.java.strategy.composicaoStrategy;

public class ContaEstacionamento {

    private CalculoValor calculo;
    private Veiculo veiculo;
    private long inicio, fim;

    public double valorConta(){
        return calculo.calcular(fim - inicio, veiculo);
    }

    public void setCalculo(CalculoValor calculo){
        this.calculo = calculo;
    }
}
