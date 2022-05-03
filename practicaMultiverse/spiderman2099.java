package practicaMultiverse;

import java.awt.*;

public class spiderman2099 extends spiderMan implements spiderPoderes{
    public spiderman2099(String nombre, String genero, int tierra, String nombreReal) {
        super(nombre, genero, tierra, nombreReal);
    }

    @Override
    public void superVelocidad(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), font:"Helvetica", size:24, Color.blue);
        s.showImage(f:"velocidad2099.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }

    @Override
    public void telepatia(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:24, Color.blue);
        s.showImage(f:"telepatia.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }

    @Override
    public void planeacion(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:24, Color.blue);
        s.showImage(f:"planear.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }
}
