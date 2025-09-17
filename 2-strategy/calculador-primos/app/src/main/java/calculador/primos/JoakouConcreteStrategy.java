package calculador.primos;
import java.util.ArrayList;
import java.util.List;

public class JoakouConcreteStrategy implements CalculadorPrimosStrategy{

    public List <Integer> generarPrimos(int n){
        List<Integer> primos = new ArrayList<>();
        
        int contPrimos = 0;
        int i = 2;
        while (contPrimos < n) {
            if (esPrimo(i)) {
                primos.add(i);
                contPrimos++;
            }
            i++;
        }
        return primos;
    }

    public boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;   
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}