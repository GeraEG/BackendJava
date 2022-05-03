package practicaMultiverse;

import java.awt.*;

public class milesMorales extends spiderMan implements milesPoderes{
    public milesMorales(String nombre, String genero, int tierra, String nombreReal) {
        super(nombre, genero, tierra, nombreReal);
    }

    @Override
    public void invisible(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), font:"Helvetica", size:24, Color.darkGray);
        s.showImage(f:"invisible.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }

    @Override
    public void venomBlast(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:24, Color.darkGray);
        s.showImage(f:"venomblast.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }

    @Override
    public void curacion(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:24, Color.darkGray);
        s.showImage(f:"curacion.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }
}
