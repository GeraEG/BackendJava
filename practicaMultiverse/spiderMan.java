package practicaMultiverse;

public class spiderMan {
    private String nombre;
    private String genero;
    private int tierra;
    private String nombreReal;

    public spiderMan (String nombre, String genero, int tierra, String nombreReal) {
        this.nombre = nombre;
        this.genero = genero;
        this.tierra = tierra;
        this.nombreReal = nombreReal;
    }

    public String getNombre() {  return nombre;  }
    public String getGenero() {  return genero;  }
    public int getTierra() {  return tierra;  }
    public String getNombreReal() {  return nombreReal;  }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero) {
        if(!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setTierra(int tierra) {
        if(tierra > 0) {
            this.tierra = tierra;
            return true;
        } else
            return false;
    }

    public boolean setNombreReal(String nombreReal) {
        if(!nombreReal.isEmpty()) {
            this.nombreReal = nombreReal;
            return true;
        } else
            return false;
    }

    public String showMessage() {
        return
                "Nombre: "+nombre+
                        "\nGénero: "+genero+
                        "\nTierra: "+tierra+
                        "\nNombre real: "+nombreReal;
    }

}
