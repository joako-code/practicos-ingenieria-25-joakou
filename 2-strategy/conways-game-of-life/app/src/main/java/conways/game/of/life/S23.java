package conways.game.of.life;
import java.util.List;

public class S23 implements SobrevivirBehavior{
    List<Integer> numeros;

    public S23(){
        numeros = List.of(2,3);
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
