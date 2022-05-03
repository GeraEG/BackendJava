package practicaMona;

public class octodex {
    private String nombre;
    private String actividad;
    private String vestimenta;

    public octodex() {
    }

    public octodex (String nombre, String actividad, String vestimenta) {
        this.nombre = nombre;
        this.actividad = actividad;
        this.vestimenta = vestimenta;
    }

    public String getNombre() {  return nombre;  }
    public String getActividad() {  return actividad;  }
    public String getVestimenta() {  return vestimenta;  }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setActividad(String actividad) {
        if(!actividad.isEmpty()) {
            this.actividad = actividad;
            return true;
        } else
            return false;
    }

    public boolean setVestimenta(String vestimenta) {
        if(!vestimenta.isEmpty()) {
            this.vestimenta = vestimenta;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+nombre+
                        "\nActividad: "+actividad+
                        "\nVestimenta: "+vestimenta;
    }
}
