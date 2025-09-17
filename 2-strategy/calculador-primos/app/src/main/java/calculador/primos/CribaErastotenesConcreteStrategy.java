package calculador.primos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CribaErastotenesConcreteStrategy {
    
    public List<Integer> generarPrimos(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        // Estimación de un límite superior para los n primeros primos
        int limite;
        if (n < 6) {
            limite = 20;
        } else {
            limite = (int) (n * (Math.log(n) + Math.log(Math.log(n))));
        }
        
        boolean[] esPrimo = new boolean[limite + 1];
        Arrays.fill(esPrimo, true);
        esPrimo[0] = esPrimo[1] = false;

        List<Integer> primos = new ArrayList<>();
        for (int p = 2; p <= limite && primos.size() < n; p++) {
            if (esPrimo[p]) {
                primos.add(p);
                for (int i = p * p; i <= limite; i += p) {
                    esPrimo[i] = false;
                }
            }
        }
        return primos;
    }
}
