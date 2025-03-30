public class Loro extends Pajaro {
    private String idioma, raza;

    public Loro(String nombre, String colorPlumaje, String idioma, String raza) {
        super(nombre, colorPlumaje);
        this.idioma = idioma;
        this.raza = raza;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void cantar() {
        System.out.println("Quiero krippy!!!");
    }

    
    
    
}
