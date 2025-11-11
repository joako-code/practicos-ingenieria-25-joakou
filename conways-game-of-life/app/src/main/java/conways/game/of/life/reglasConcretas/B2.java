package conways.game.of.life.reglasConcretas;
import java.util.List;

import conways.game.of.life.NacimientoBehavior;

public class B2 extends NacimientoBehavior{

    public B2(){
        super(List.of(2));
    }

    @Override
    public boolean tieneQueNacer(int cantVecinosVivos){
        return this.numeros.contains(cantVecinosVivos);
    }

}