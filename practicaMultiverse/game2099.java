package practicaMultiverse;

public class game2099 {
    public static void main(String[] args) throws InterruptedException {
        Test2099();
    }

    public static void Test2099() throws InterruptedException {
        Screen s = new Screen();
        spiderman2099 spider = new spiderman2099(
                nombre:"Spider man 2099",
                genero:"Masculino",
                tierra:"928",
                nombreReal:"Miguel O´hara"
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {
                    spiderman2099.superVelocidad(screen);
                    Thread.sleep(millis:3000);

                    spiderman2099.telepatia(screen);
                    Thread.sleep(millis:3000);

                    spiderman2099.planeacion(screen);
                    Thread.sleep(millis:3000);

                } catch (InterruptedException e) {
                    e.pritnStackTrace();
                }

            }
        };

        Thread attackSpiderman = new Thread(attack);
        attackSpiderman.start();
    }
}
