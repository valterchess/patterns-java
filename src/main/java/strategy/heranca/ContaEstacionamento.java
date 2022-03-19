package main.java.strategy.heranca;

public abstract class ContaEstacionamento {
    private Veiculo veiculo;
    private long inicio, fim;

    public abstract double valorConta();
}
