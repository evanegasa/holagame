package ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Personajes extends javax.swing.JFrame {

    BufferedImage a;
    private Object PictureArt;
    private Object jFrame1;
    private int posicion;
    private boolean continuar;
  protected void paintComponent(Graphics g) {
    super.paintComponents(g);
    g.drawImage(a,0,0, this);
}

    private ImageIcon b;
    public Personajes(int posicion) {
        continuar = false;
        this.posicion = posicion;
        JLabel.getDefaultLocale();
        b = new ImageIcon((getClass().getResource("/imagenes/grass.jpg")));
        setContentPane(new JLabel(b));

        initComponents();

        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLabel1.setVerticalAlignment(JLabel.CENTER);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        while(true){
            System.out.print("");
            if(continuar){
                setVisible(false);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        switch (posicion) {
            case 1:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/elfo.jpg")));
                break;
            case 2:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/hada.gif")));
                break;
            case 3:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/TroncoCaido.jpg")));
                break;
            case 4:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/mago.jpg")));
                break;
            case 5:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/monstruoBosque.jpg")));
                break;
            case 6:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/arcoiris.png")));
                break;
            case 7:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/minotauro.jpg")));
                break;
            case 8:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/dragon.jpg")));
                break;
            case 9:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/puenteRoto.jpg")));
                break;
            case 10:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/gnomos.jpg")));
                break;
            case 11:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/ninfa.png")));
                break;
            case 12:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/ermitaño.jpg")));
                break;
        }
        jLabel1.setVerticalAlignment(JLabel.CENTER);
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setIconImage(a);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setText("Entendido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        switch (posicion) {
            case 1:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/elfo.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 2:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/hada.gif")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 3:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/TroncoCaido.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 4:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/mago.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 5:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/monstruoBosque.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 6:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/arcoiris.png")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 7:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/minotauro.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 8:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/dragon.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 9:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/puenteRoto.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 10:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/gnomos.jpg")));

                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 11:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/ninfa.png")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
            case 12:
                this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/imagenes/ermitaño.jpg")));
                jLabel1.setHorizontalAlignment(JLabel.CENTER);
                jLabel1.setVerticalAlignment(JLabel.CENTER);
                break;
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        continuar = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    
    // End of variables declaration//GEN-END:variables
}
