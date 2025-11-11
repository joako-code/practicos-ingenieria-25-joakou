package conways.game.of.life;

import java.util.HashMap;
import java.util.List;

import conways.game.of.life.Celula.EstadoDeVida;
import conways.game.of.life.ObserversDisplay.Observer;
import conways.game.of.life.color.ColorBehavior;
import conways.game.of.life.color.Rojo;

public class GameOfLife {

    Celula[][] matrix;
    int filas;
    int columnas;
    List<Observer> Observers;


    NacimientoBehavior nacimientoBehavior;
    SobrevivirBehavior sobrevivirBehavior;

    public GameOfLife(int[][] matrixInicial, NacimientoBehavior nacimientoBehavior, SobrevivirBehavior sobrevivirBehavior){

        this.filas = matrixInicial.length;
        this.columnas = matrixInicial[0].length;
        this.matrix = new Celula[filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0 ; j < columnas;j++){
                if(matrixInicial[i][j] == 1){
                    this.matrix[i][j] = new Celula(EstadoDeVida.VIVO, new Rojo());
                }else{
                    this.matrix[i][j] = new Celula(EstadoDeVida.MUERTO); 
                }
            }
        }

        setNacimientoBehavior(nacimientoBehavior);
        setSobrevivirBehavior(sobrevivirBehavior);

    }

    public void setNacimientoBehavior(NacimientoBehavior nacimientoBehavior){
        this.nacimientoBehavior = nacimientoBehavior;
    }

    public void setSobrevivirBehavior(SobrevivirBehavior sobrevivirBehavior){
        this.sobrevivirBehavior = sobrevivirBehavior;
    }

    public void addObserver(Observer o){
        Observers.add(o);
    }

    public void remove(Observer o){
        Observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o:Observers){
            o.update(matrix,filas,columnas,nacimientoBehavior,sobrevivirBehavior);
        }
    }

    public Celula[][] siguienteGeneracion(){
        Celula[][] nuevaGeneracion = new Celula[filas][columnas];

        for(int i = 0; i < filas ; i++){
            for(int j = 0; j < columnas; j++){

                int vecinosVivosDeLaCelula = cantVecinosVivos(i, j);
                EstadoDeVida estadoDeLaCelula = matrix[i][j].estado;

                if(estadoDeLaCelula == EstadoDeVida.VIVO && sobrevivirBehavior.tieneQueSobrevivir(vecinosVivosDeLaCelula)){


                    nuevaGeneracion[i][j] = new Celula(EstadoDeVida.VIVO);


                }else if (estadoDeLaCelula == EstadoDeVida.MUERTO && nacimientoBehavior.tieneQueNacer(vecinosVivosDeLaCelula)){

                    if(nacimientoBehavior.tieneQueNacerConColor()){
                        nuevaGeneracion[i][j] = new Celula(EstadoDeVida.VIVO,colorMayoritario(i,j));
                    }else{
                        nuevaGeneracion[i][j] = new Celula(EstadoDeVida.VIVO);
                    }
                    


                }else{


                    nuevaGeneracion[i][j] = new Celula(EstadoDeVida.MUERTO);


                }
                
            }
        }

        matrix = nuevaGeneracion;
        return matrix;
    }

    
    public int cantVecinosVivos(int x, int y){
        int cantVecinosVivos = 0;

        for(int i = -1; i<=1 ; i++){
            for(int j = -1 ; j <= 1;j++){
                int actualX = i + x;
                int actualY = j + y;
                if(actualX >= 0 && actualX < filas && actualY >= 0 && actualY < columnas && !(actualX == x && actualY == y)){
                    if(matrix[actualX][actualY].estado == EstadoDeVida.VIVO){
                        cantVecinosVivos++;
                    }
                }
            }
        }
        return cantVecinosVivos;
    }
    
    public ColorBehavior colorMayoritario(int x, int y){
        HashMap<ColorBehavior, Integer> colorCount = new HashMap<>();

        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                int actualX = x + i;
                int actualY = y + j;
                if(actualX >= 0 && actualX < filas && actualY >= 0 && actualY < columnas && !(actualX == x && actualY == y)){
                    Celula current = matrix[actualX][actualY];
                    if(current.getColor() != null){
                        colorCount.put(current.getColor(), colorCount.getOrDefault(current.getColor(), 0) + 1);
                    }
                }
            }
        }

        ColorBehavior mayoritario = null;
        int maxCount = 0;


        for(java.util.Map.Entry<ColorBehavior, Integer> entry : colorCount.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mayoritario = entry.getKey();
            }
        }

        return mayoritario;
    }

}
