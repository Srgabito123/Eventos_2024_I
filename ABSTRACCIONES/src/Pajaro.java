public abstract class Pajaro{
    private String nombre, colorPlumaje;

    public Pajaro(String nombre, String colorPlumaje) {
        this.nombre = nombre;
        this.colorPlumaje = colorPlumaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public abstract void cantar();
    
}