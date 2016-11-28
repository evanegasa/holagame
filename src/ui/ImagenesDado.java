package ui;

import javax.swing.ImageIcon;

public class ImagenesDado {

    public ImageIcon icoImagen;

    public ImageIcon gifDado(int dado) {

        switch (dado) {

            case 1:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/gifs/dados-01.gif"));
                break;
            case 2:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/gifs/dados-02.gif"));
                break;
            case 3:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/gifs/dados-03.gif"));
                break;
            case 4:
                try {
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/gifs/dados-04.gif"));
                    
                } catch (Exception e) {
                e.printStackTrace();
                }
                break;
            case 5:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/gifs/dados-05.gif"));
                break;
            case 6:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/gifs/dados-06.gif"));
                break;
               
        }
        return icoImagen;
    }
    
    public ImageIcon gifDadoR(int dado) {

        switch (dado) {

            case 1:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/1.png"));
                break;
            case 2:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/2.png"));
                break;
            case 3:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/3.png"));
                break;
            case 4:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/4.png"));
                break;
            case 5:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/5.png"));
                break;
            case 6:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Dado/6.png"));
                break;
               
        }
        return icoImagen;
    }

}
