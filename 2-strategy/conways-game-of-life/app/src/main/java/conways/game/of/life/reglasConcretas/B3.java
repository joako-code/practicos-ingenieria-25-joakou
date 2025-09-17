package conways.game.of.life.reglasConcretas;
import java.util.List;

import conways.game.of.life.NacimientoBehavior;

public class B3 extends NacimientoBehavior{

    public B3(){
        super(List.of(3));
    }

    @Override
    public boolean tieneQueNacer(int cantVecinosVivos){
        return this.numeros.contains(cantVecinosVivos);
    }

}
