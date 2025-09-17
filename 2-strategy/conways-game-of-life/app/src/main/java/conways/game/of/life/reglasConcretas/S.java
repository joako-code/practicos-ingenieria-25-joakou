package conways.game.of.life.reglasConcretas;
import java.util.List;

import conways.game.of.life.SobrevivirBehavior;

public class S extends SobrevivirBehavior{

    public S(){
        super(List.of(0));
    }

    @Override
    public boolean tieneQueSobrevivir(int cantVecinosVivos){
        return this.numeros.contains(cantVecinosVivos);
    }
}
