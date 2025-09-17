package conways.game.of.life;

public class Celula {

    public enum EstadoDeVida{
        VIVO,
        MUERTO
    }

    EstadoDeVida estado;

    public Celula(EstadoDeVida estado){
        this.estado = estado;
    }

    public void changeEstado(){
        if(this.estado == EstadoDeVida.VIVO){
            this.estado = EstadoDeVida.MUERTO;
        }else{
            this.estado = EstadoDeVida.VIVO;
        }
    }
}
