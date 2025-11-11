package conways.game.of.life.reglasConcretas;
import java.util.List;

import conways.game.of.life.NacimientoBehavior;

public class B36 extends NacimientoBehavior{

    public B36(){
        super(List.of(3,6));
    }

    @Override
    public boolean tieneQueNacer(int cantVecinosVivos){
        return this.numeros.contains(cantVecinosVivos);
    }

}