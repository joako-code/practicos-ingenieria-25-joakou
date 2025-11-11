package conways.game.of.life;
import conways.game.of.life.reglasConcretas.*;
public class App {

    public static void main(String[] args) {
        int[][] inicializacion = {
            {0,0,0,0,0},
            {0,1,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,1,0,1,1}
        };

        NacimientoBehavior reglaParaNacer = new B3Inmigration();
        SobrevivirBehavior reglaParaSobrevivir = new S23();

        GameOfLife game = new GameOfLife(inicializacion, reglaParaNacer, reglaParaSobrevivir);

        System.out.println("|ETAPA 1: \n" + game.toString());
        game.siguienteGeneracion();
        System.out.println("|ETAPA 2: \n" + game.toString());
    }
}
