package Data;

import java.awt.Color;

public class Player {

    private int posicion;
    private String name;
    private boolean canPlay = true;
    private int turns;
    private boolean isWinner;

    public Player(String name) {
        this.name = name;
        posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getName() {
        return name;
    }
    
    public void cantPlay(int turns){
        this.canPlay = false;
        this.turns = turns;
    }

    public boolean canPlay() {
        if(canPlay == false){
            turns--;
        }if(turns == -1){
            canPlay = true;
        }
        
        return canPlay;
    }
}