package conways.game.of.life;

import java.util.List;

public abstract class SobrevivirBehavior {

    protected List<Integer> numeros;

    public SobrevivirBehavior(List<Integer> numeros){
        this.numeros = numeros;
    }

    public abstract boolean tieneQueSobrevivir(int cantVecinosVivos);

    public String toString(){
        String res = "S";
        for(int i = 0; i < numeros.size();i++){
            res+=numeros.get(i);
        }
        return res;
    }
}