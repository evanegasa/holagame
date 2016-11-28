package ui;

import BusinessLogic.*;

import java.awt.image.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI implements Runnable {

    private static final long serialVersionUID = 1L;
    
    private Thread thread;
    private GameFrame gameFrame = new GameFrame();
    private JFrame f;
    private static BufferedImage gameImage, plainImage, menuImage;
    private static BufferedImage [] jugadores;
    public static int[] xDir = new int[65], yDir = new int[65];

    public GUI() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/Data/Casillas.csv"));
            String line;
            int i = 0;
            while((line = reader.readLine()) != null){
                String [] coordinates  = line.split(", ");
                xDir[i] = Integer.parseInt(coordinates[0]);
                yDir[i] = Integer.parseInt(coordinates[1]);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run() {
        Thread thread;
        while(true){
            PerdidosEnElBosque.jugar();
        }
    }
    
    public void render(){
        f = gameFrame.getGameFrame();
        f.setLocationRelativeTo(null);
    }
    
    public void endGame(int ganador){
        JOptionPane.showMessageDialog(null, "Felicidades " + PerdidosEnElBosque.getPlayer()[ganador].getName() + "has ganado!, Buena la Rata" , "Hay un ganador!", JOptionPane.DEFAULT_OPTION);
        if (JOptionPane.showConfirmDialog(null, "Desan jugar de nuevo?", "No nos abandones!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
            f.setVisible(false);
            PerdidosEnElBosque.main(new String[0]);
        } else{
            JOptionPane.showMessageDialog(null, "OK...." , "Será en otra ocasión!", JOptionPane.DEFAULT_OPTION);
            System.exit(0);
        }
    }

    public void renderCreature(int posicion) {
        new Personajes(posicion);
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
    }

}
