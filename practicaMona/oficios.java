package practicaMona;

public class oficios {
    public static void main(String[] args) {
        minertocat();
        luchadortocat();
        mummytocat();
        megacat();
        stormtroopocat();
        linktocat();
    }

    static void minertocat() {
        Minertocat minero = new Minertocat();
        System.out.println(minero.showMessage());
        System.out.println("");
    }

    static void luchadortocat() {
        Luchadortocat luchador = new Luchadortocat();
        System.out.println(luchador.showMessage());
        System.out.println("");
    }

    static void mummytocat() {
        Mummytocat momia = new Mummytocat();
        System.out.println(momia.showMessage());
        System.out.println("");
    }

    static void megacat() {
        Megacat megaman = new Megacat();
        System.out.println(megaman.showMessage());
        System.out.println("");
    }

    static void stormtroopocat() {
        Stormtroopocat stormtrooper = new Stormtroopocat();
        System.out.println(stormtrooper.showMessage());
        System.out.println("");
    }

    static void linktocat() {
        Linktocat link = new Linktocat();
        System.out.println(link.showMessage());
    }
}
