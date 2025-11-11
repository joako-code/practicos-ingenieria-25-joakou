package conways.game.of.life;

import conways.game.of.life.color.ColorBehavior;

public class Celula {

    public enum EstadoDeVida{
        VIVO,
        MUERTO
    }

    EstadoDeVida estado;
    ColorBehavior colorActual;

    public Celula(EstadoDeVida estado){
        this.estado = estado;
    }

    public Celula(EstadoDeVida estado,ColorBehavior color){
        this.estado = estado;
        setColor(color);
    }

    public void setColor(ColorBehavior color){
        this.colorActual = color;
    }
    
    public String toString(){
        if(colorActual == null){return "⚫";}
        return colorActual.toStringIcon();
    }

    public String getColorName(){
        if(colorActual == null){return "SIN COLOR";}
        return colorActual.toStringName();
    }

    public ColorBehavior getColor(){
        return colorActual;
    }

    /* 
    public void changeEstado(){
        if(this.estado == EstadoDeVida.VIVO){
            this.estado = EstadoDeVida.MUERTO;
        }else{
            this.estado = EstadoDeVida.VIVO;
        }
    }
    */
}
