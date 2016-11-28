package Data;

import BusinessLogic.ControlJuego;
import java.util.Arrays;
import java.util.Random;

public class Tablero {

    private final int numeroCasillas = 100;
    private Casilla[] tablero;

    public Tablero() {
        
        int[] pos = {0,0,0,0,0,0,0,0,0};
        Random r = new Random();
        int k = 0;
        for (int i = 0; i < 9; i++) {
            outerLoop:
            while(true){
                k = r.nextInt(60) + 1;
                if(k == 19 || k == 35 || k == 48){
                    k += 5;
                }
                for (int j = 0; j < 9; j++) {
                    if(j == 8 && Math.abs(pos[j] - k) > 5){
                        break outerLoop;
                    }
                    if(Math.abs(pos[j] - k) < 5){
                        break;
                    }
                }
            }
            pos[i] = k;
        }

        System.out.println(Arrays.toString(pos));
        
        tablero = new Casilla[numeroCasillas];
        tablero[pos[0]] = new Casilla("Hada del pantano", 5, 0, "Avanzas 5 casillas", true);
        tablero[pos[1]] = new Casilla("Duende de la suerte", 0, 1, "Tienes 1 lanzamiento extra", true);
        tablero[pos[2]] = new Casilla("Ninfa de la laguna", 8, 0, "Avanzas 8 casillas", true);
        tablero[pos[3]] = new Casilla("El sabio hermitaño", 0, 2, "Tienes 2 lanzamientos extras", true);

        tablero[pos[4]] = new Casilla("El minotauro", 0, -2, "Pierdes dos turnos", true);
        tablero[pos[5]] = new Casilla("El dragon", 0, -2, "Pierdes dos turnos", true);
        tablero[64] = new Casilla("El gran monstruo del bosque", -20, 0, "Retrocedes 8 casillas", true);

        tablero[pos[6]]  = new Casilla("Puente arcoiris", 15, 0, "Avanzas 15 casillas", false);
        tablero[pos[7]] = new Casilla("Puente roto", -15, 0, "Retrocedes 15 casillas", false);
        tablero[pos[8]] = new Casilla("Tronco caido", 0, -1, "Pierdes 1 turno", false);
    }

    public Casilla[] getTablero() {
        return tablero;
    }
    
    public Casilla elfoEnigma() {
        String mensaje = "";
        if(ControlJuego.rollDice()  >= 6){
            return new Casilla("Elfo enignma", 0, -1, "Pierdes un turno", true);
        } 
        return null;
    }

    public Casilla magoMontana() {
        if(ControlJuego.rollDice()>= 8){
            return new Casilla("", 10, 0, "Avanzas 10 casillas", true);
        }
            return new Casilla("", -14, 0, "Retrocedes 14 casillas", true);
    }

    public Casilla Dragon() {
        if(ControlJuego.rollDice()%2 == 0){
            return null;
        }else{
            return new Casilla("", 0, -3, "Pierdes 3 turnos",true);
        }
    }
}