package ui;

import BusinessLogic.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameFrame extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
    private static BufferedImage gameImage;
    private static BufferedImage [] jugadores;
    private static boolean canRoll, canContinue;
    private static int result;
    
    public GameFrame() {
        try {
            
            ImageIcon a = new ImageIcon("");
            
            gameImage = ImageIO.read(GUI.class.getResource("/imagenes/tablero.jpg"));
            
            BufferedImage player1 = ImageIO.read(GUI.class.getResource("/imagenes/rojo.png"));
            BufferedImage player2 = ImageIO.read(GUI.class.getResource("/imagenes/amarillo.png"));
            BufferedImage player3 = ImageIO.read(GUI.class.getResource("/imagenes/verde.png"));
            BufferedImage player4 = ImageIO.read(GUI.class.getResource("/imagenes/azul.png"));
            jugadores = new BufferedImage [] {player1, player2, player3, player4};
        } catch (IOException e) {
            System.err.println("No such  file in directory");
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(gameImage.getWidth() + 220, gameImage.getHeight()+20));
        setResizable(false);
        
    }
    
    public JFrame getGameFrame(){
        canContinue = false;
        canRoll = false;
        result = 0;
        
        try {
            gameImage = ImageIO.read(GUI.class.getResource("/imagenes/tablero.jpg"));
        } catch (IOException e) {
            System.err.println("No such  file in directory");
        }
        int a = 0;
        for (int i = 0; i < PerdidosEnElBosque.getPlayer().length; i++) {
            int offset = 0;
            int pos = PerdidosEnElBosque.getPlayer()[i].getPosicion();
            for (int j = 0; j < PerdidosEnElBosque.getPlayer().length; j++) {
                if(pos == PerdidosEnElBosque.getPlayer()[j].getPosicion() && i != j){
                    offset = a;
                    a++;
                    break;
                }
            }
            if(pos < 0) pos = 0;
            renderPlayer(i, GUI.xDir[pos], GUI.yDir[pos], offset);
        }
         
        JPanel panel = new JPanel() {
            @Override
            
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(gameImage, 0, 0, null);
            }
        };
        panel.setPreferredSize(new Dimension(gameImage.getWidth(), gameImage.getHeight()));
        
        JPanel panel2 = new JPanel();
        JLabel gifDado = new JLabel();
        JLabel gifDado2 = new JLabel();
        JLabel resultLabel = new JLabel("Lanza los dados...");
        gifDado.setIcon(new ImagenesDado().gifDado(3));
        gifDado2.setIcon(new ImagenesDado().gifDado(5));

        JButton b = new JButton("Tirar Dado");
            b.addActionListener((ActionEvent ae) -> {
                int i = ControlJuego.rollDie();
                int j = ControlJuego.rollDie();
                result = i + j;
                resultLabel.setText("Te mueves " + result + " casillas");
                gifDado.setIcon(new ImagenesDado().gifDadoR(i));
                gifDado2.setIcon(new ImagenesDado().gifDadoR(j));
                panel2.remove(b);

                GridBagConstraints gbc = new GridBagConstraints();
                    gbc.insets = new Insets(5, 5, 5, 5);
                    gbc.gridx = 1;
                    gbc.gridy = 5;
                    gbc.gridwidth = 2;
                
                JButton continueButton = new JButton("Continuar");
                    continueButton.addActionListener((ActionEvent ae2) -> {
                        panel2.removeAll();
                        remove(panel2);
                        canContinue = true;
                    });
                
                panel2.add(continueButton, gbc);
                panel2.repaint();
                panel2.revalidate();
                
                this.canRoll = true;
            });
            
            panel2.setLayout(new GridBagLayout());
            panel2.setPreferredSize(new Dimension(200, gameImage.getHeight()));
            
            GridBagConstraints gbc = new GridBagConstraints();

                gbc.insets = new Insets(5, 5, 5, 5);
            
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.gridwidth = 2;
            panel2.add(new JLabel(new ImageIcon(jugadores[PerdidosEnElBosque.getCurrentPlayer()])), gbc);
                gbc.gridx = 1;
                gbc.gridy = 2;
            panel2.add(new JLabel("Es el turno de "+PerdidosEnElBosque.getPlayer()[PerdidosEnElBosque.getCurrentPlayer()].getName()), gbc);
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.gridwidth = 1;
            panel2.add(gifDado, gbc);
                gbc.gridx = 2;
                gbc.gridy = 3;
            panel2.add(gifDado2, gbc);
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.gridwidth = 2;
            panel2.add(resultLabel, gbc);
                gbc.gridx = 1;
                gbc.gridy = 5;
            panel2.add(b, gbc);
                
        add(panel, BorderLayout.WEST);
        add(panel2, BorderLayout.EAST);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        return this;
    }
    
    public static int roll(){
        while(true){
            System.out.print("");
            if(canRoll){
                break;
            }
        }
        
        while(true){
            System.out.print("");
            if(canContinue){
                break;
            }
        }
        return result;
    }

    private void renderPlayer(int player, int xPos, int yPos, int offset){
        int [] pixels = jugadores[player].getRGB(0, 0, 50, 50, null, 0, 50); 
        
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if(pixels[i*50 + j] != 16777215 && pixels[i*50 + j] != 0)
                    gameImage.setRGB(xPos + j - 25 + 15*offset, yPos + i - 35, pixels[i*50 + j]);
            }
        }
    }
    
}
