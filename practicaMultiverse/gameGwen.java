package practicaMultiverse;

public class gameGwen {
    public static void main(String[] args) throws InterruptedException {
        TestGwen();
    }

    public static void TestGwen() throws InterruptedException {
        Screen s = new Screen();
        gwenStacy miles = new gwenStacy()
                nombre:"Spider Gwen",
                genero:"Femenino",
                tierra:"65",
                nombreReal:"Gwendolyne Stacy"
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {
                    gwenStacy.superFuerza(screen);
                    Thread.sleep(millis:3000);

                    gwenStacy.superVelocidad(screen);
                    Thread.sleep(millis:3000);

                    gwenStacy.telaranaOrganica(screen);
                    Thread.sleep(millis:3000);

                } catch (InterruptedException e) {
                    e.pritnStackTrace();
                }

            }
        };

        Thread attackGwen = new Thread(attack);
        attackGwen.start();
    }
}
