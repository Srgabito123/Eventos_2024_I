public class Carro {
    private String marca;
    private Short cilindraje;
    private byte numeroPasajeros;
    private boolean gobierno;

    

    public Carro(String marca, Short cilindraje, byte numeroPasajeros, boolean gobierno) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.numeroPasajeros = numeroPasajeros;
        this.gobierno = gobierno;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Short getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(Short cilindraje) {
        this.cilindraje = cilindraje;
    }
    public byte getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(byte numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    public boolean isGobierno() {
        return gobierno;
    }
    public void setGobierno(boolean gobierno) {
        this.gobierno = gobierno;
    }
    

    

}
