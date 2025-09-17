package conways.game.of.life;

import java.util.List;

public abstract class NacimientoBehavior {
    protected List<Integer> numeros;

    public NacimientoBehavior(List<Integer> numeros){
        this.numeros = numeros;
    }

    public abstract boolean tieneQueNacer(int cantVecinosVivos);

    public String toString(){
        String res = "B";
        for(int i = 0; i < numeros.size();i++){
            res+=numeros.get(i);
        }
        return res;
    }
}