package conways.game.of.life;
import java.util.List;

public class B2 implements NacimientoBehavior{
    List<Integer> numeros;

    public B2(){
        numeros = List.of(2);
    }

    public boolean tieneQueNacer(int cantVecinosVivos){
        return numeros.contains(cantVecinosVivos);
    }

    public String toString(){
        String res = "B";
        for(int i = 0; i < numeros.size();i++){
            res+=numeros.get(i);
        }
        return res;
    }

    
}