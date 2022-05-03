package practicaMultiverse;

public class gameMiles {
    public static void main(String[] args) throws InterruptedException {
        TestMiles();
    }

    public static void TestMiles() throws InterruptedException {
        Screen s = new Screen();
        milesMorales miles = new milesMorales(
                nombre:"Spider man",
                genero:"Masculino",
                tierra:"1610",
                nombreReal:"Miles Morales"
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {
                    milesMorales.invisible(screen);
                    Thread.sleep(millis:3000);

                    milesMorales.venomBlast(screen);
                    Thread.sleep(millis:3000);

                    milesMorales.curacion(screen);
                    Thread.sleep(millis:3000);

                } catch (InterruptedException e) {
                    e.pritnStackTrace();
                }

            }
        };

        Thread attackMiles = new Thread(attack);
        attackMiles.start();
    }
}
