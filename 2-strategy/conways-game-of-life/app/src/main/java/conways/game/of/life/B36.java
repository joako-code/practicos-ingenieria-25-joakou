package conways.game.of.life;
import java.util.List;

public class B36 implements NacimientoBehavior{
    List<Integer> numeros;

    public B36(){
        numeros = List.of(3,6);
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