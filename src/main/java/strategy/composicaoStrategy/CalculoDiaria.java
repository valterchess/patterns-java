package main.java.strategy.composicaoStrategy;

public class CalculoDiaria implements CalculoValor{
    private final double valorDiaria;

    public CalculoDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }

//    public double calcular(){
//        return valorDiaria * Math.ceil(periodo / Hora);
//    }

    @Override
    public double calcular(long l, Veiculo veiculo) {
        return 0;
    }
}
