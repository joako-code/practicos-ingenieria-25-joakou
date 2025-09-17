package calculador.primos;

import java.util.ArrayList;
import java.util.List;

public class GeminiConcreteStrategy {

    public List<Integer> generarPrimos(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        List<Integer> primos = new ArrayList<>();
        int candidato = 2;
        while (primos.size() < n) {
            if (esPrimo(candidato)) {
                primos.add(candidato);
            }
            candidato++;
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
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