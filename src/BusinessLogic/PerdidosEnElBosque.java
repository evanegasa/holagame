package BusinessLogic;

import ui.*;
import Data.*;

public class PerdidosEnElBosque {
    
    public static GUI gui = new GUI();
    private static Player[] player;
    private static Tablero tablero;
    private static int currentPlayer;
    
    public static void main(String[] args) {
        tablero = new Tablero();
        currentPlayer = 0;
        new PantallaInicio();
    }
    
    public static void jugar(){
        while(true){
        for (currentPlayer = 0; currentPlayer < player.length; currentPlayer++) {
            gui.render();
            if (player[currentPlayer].canPlay()) {
                int playing = 1;
                while (playing != 0) {
                    
                    int movement = ControlJuego.rollDice();

                    player[currentPlayer].setPosicion(player[currentPlayer].getPosicion() + movement);

                    if (player[currentPlayer].getPosicion() == 65) {
                        gui.endGame(currentPlayer);
                        return;
                    }

                    if (player[currentPlayer].getPosicion() > 65) {
                        player[currentPlayer].setPosicion(player[currentPlayer].getPosicion() - movement);
                        playing--;
                        break;
                    }

                    Casilla casilla = tablero.getTablero()[player[currentPlayer].getPosicion()];


                        if (player[currentPlayer].getPosicion() == 19) {
//                            gui.print("Elfo enigma: lanza el dado, si obtienes 6 o más, pierdes turno, si sacas menos puedes seguir con tu camino");
                            casilla = tablero.elfoEnigma();
                            if (casilla == null) {
//                                gui.print("Te has salvado");
                            }
                        } else if (player[currentPlayer].getPosicion() == 35) {
//                            gui.print("Mago de la Montaña: lanza el dado, si sacas 8 o más avanzas 10 casillas, pero si sacas menos retrocederás 14 casillas");
                            casilla = tablero.magoMontana();
                        } else if (player[currentPlayer].getPosicion() == 48) {
//                            gui.print("El Dragón: Podrás pasar tranquilo si obtienes un número par, de lo contrario perderás 3 turrnos");
                            casilla = tablero.Dragon();
                            if (casilla == null) {
//                                gui.print("Te has salvado");
                            }
                        }
                    
                    
                    if (casilla != null) {
                        gui.renderCreature(player[currentPlayer].getPosicion());
                        player[currentPlayer].setPosicion(player[currentPlayer].getPosicion() + casilla.getPositionControl());
                        if(player[currentPlayer].getPosicion() < 0) player[currentPlayer].setPosicion(0);
                        if (casilla.getTurnControl() >= 0) {
                            playing += casilla.getTurnControl();
                        } else {
                            player[currentPlayer].cantPlay(casilla.getTurnControl() * (-1));
                        }
                    }
                    if(playing > 1){
                        gui.render();
                    }
                    playing--;
                }
            }
        }
        }
    }

    public static void setPlayer(Player[] player) {
        PerdidosEnElBosque.player = player;
    }
    
    public static Player[] getPlayer() {
        return player;
    }

    public static int getCurrentPlayer() {
        return currentPlayer;
    }
}