package conways.game.of.life;
import java.util.List;

public class S implements SobrevivirBehavior{
    List<Integer> numeros;

    public S(){
        numeros = List.of(0);
    }

    public boolean tieneQueSobrevivir(int cantVecinosVivos){
        return numeros.contains(cantVecinosVivos);
    }

    public String toString(){
        String res = "S";
        for(int i = 0; i < numeros.size();i++){
            res+=numeros.get(i);
        }
        return res;
    }
}
