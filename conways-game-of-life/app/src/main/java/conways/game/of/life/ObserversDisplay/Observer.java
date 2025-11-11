package conways.game.of.life.ObserversDisplay;

import conways.game.of.life.Celula;
import conways.game.of.life.NacimientoBehavior;
import conways.game.of.life.SobrevivirBehavior;

public abstract class Observer {
    Celula[][] matrix;
    int filas;
    int columnas;
    NacimientoBehavior nacimientoBehavior;
    SobrevivirBehavior sobrevivirBehavior;

    public void update(Celula[][] matrix,int filas, int columnas, NacimientoBehavior nacimientoBehavior, SobrevivirBehavior sobrevivirBehavior){
        this.matrix = matrix;
        this.filas = filas;
        this.columnas = columnas;
        this.nacimientoBehavior = nacimientoBehavior;
        this.sobrevivirBehavior = sobrevivirBehavior;
    }

    public void renderGame(){

    }
}
