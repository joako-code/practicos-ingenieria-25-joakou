package calculador.primos;

import java.util.List;

public class CalculadorPrimos{
    private CalculadorPrimosStrategy strategy;;

    public CalculadorPrimos(CalculadorPrimosStrategy strategy){
        this.strategy = strategy;
    } 

    public void setStrategy(CalculadorPrimosStrategy strategy){
        this.strategy = strategy;
    }

    public List<Integer> generarPrimos(int n){
        return strategy.generarPrimos(n);
    }

}