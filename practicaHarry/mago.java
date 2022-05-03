package practicaHarry;

public class mago {
    public static void main(String[] args) {
        harry();
        newton();
        sirius();
        severus();
        ron();
    }

    private static void harry() {
        magia harry = new magia();
        harry.setNombre("Harry Potter");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBoggart("Dementor");
        harry.setPatronus("Ciervo");
        System.out.println(harry.showMessage());
        System.out.println("");
    }

    private static void newton() {
        magia newton = new magia();
        newton.setNombre("Newton Scamander");
        newton.setGenero("Masculino");
        newton.setCasa("Hufflepuff");
        newton.setBoggart("Trabajar en una oficina");
        newton.setPatronus("Puercoespín");
        System.out.println(newton.showMessage());
        System.out.println("");
    }

    private static void sirius() {
        magia sirius = new magia();
        sirius.setNombre("Sirius Black");
        sirius.setGenero("Maculino");
        sirius.setCasa("Gryffindor");
        sirius.setBoggart("El convertido en perro");
        sirius.setPatronus("Perro");
        System.out.println(sirius.showMessage());
        System.out.println("");
    }

    private static void severus() {
        magia severus = new magia();
        severus.setNombre("Severus Snape");
        severus.setGenero("Masculino");
        severus.setCasa("Slyterin");
        severus.setBoggart("Lord Voldemort");
        severus.setPatronus("Cierva");
        System.out.println(severus.showMessage());
        System.out.println("");
    }

    private static void ron() {
        magia ron = new magia();
        ron.setNombre("Ronald Weasley");
        ron.setGenero("Masculino");
        ron.setCasa("Gryffindor");
        ron.setBoggart("Arañas");
        ron.setPatronus("Terrier");
        System.out.println(ron.showMessage());
        System.out.println("");
    }
}
