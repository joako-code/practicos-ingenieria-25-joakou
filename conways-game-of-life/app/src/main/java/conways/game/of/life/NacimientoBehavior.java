package conways.game.of.life;

import java.util.List;

public abstract class NacimientoBehavior {
    protected List<Integer> numeros;
    protected boolean debeNacerConColor;

    public NacimientoBehavior(List<Integer> numeros){
        this.numeros = numeros;
    }

    public NacimientoBehavior(List<Integer> numeros, boolean debeNacerConColor){
        this.numeros = numeros;
        this.debeNacerConColor = debeNacerConColor;
    }

    public abstract boolean tieneQueNacer(int cantVecinosVivos);

    public boolean tieneQueNacerConColor(){
        return debeNacerConColor;
    }

    public String toString(){
        String res = "B";
        for(int i = 0; i < numeros.size();i++){
            res+=numeros.get(i);
        }
        return res;
    }
}