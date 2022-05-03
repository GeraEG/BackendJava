package practicaMultiverse;

import java.awt.*;

public class gwenStacy extends spiderMan implements gwenPoderes{
    public gwenStacy(String nombre, String genero, int tierra, String nombreReal) {
        super(nombre, genero, tierra, nombreReal);
    }

    @Override
    public void superFuerza(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), font:"Helvetica", size:24, Color.magenta);
        s.showImage(f:"fuerza.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }

    @Override
    public void superVelocidad(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:24, Color.magenta);
        s.showImage(f:"velocidad.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }

    @Override
    public void telaranaOrganica(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), font:"Helvetica", size:24, Color.magenta);
        s.showImage(f:"telaraña.jpg");
        s .setBounds(x:150,y:150,width:900,height:900);
    }
}
