package conways.game.of.life.reglasConcretas;
import java.util.List;

import conways.game.of.life.SobrevivirBehavior;

public class S23 extends SobrevivirBehavior{

    public S23(){
        super(List.of(2,3));
    }

    @Override
    public boolean tieneQueSobrevivir(int cantVecinosVivos){
        return this.numeros.contains(cantVecinosVivos);
    }
}
