package conways.game.of.life.reglasConcretas;
import java.util.List;

import conways.game.of.life.NacimientoBehavior;

public class B3Inmigration extends NacimientoBehavior{

    public B3Inmigration(){
        super(List.of(3,6),true);
    }

    @Override
    public boolean tieneQueNacer(int cantVecinosVivos){
        return this.numeros.contains(cantVecinosVivos);
    }

}