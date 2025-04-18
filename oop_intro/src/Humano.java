public class Humano {
    private String nombre;
    private byte edad;
    private String identificacion;

    public Humano(String nuevoNombre, byte nuevaEdad, String nuevaIdentificacion){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        identificacion = nuevaIdentificacion;
    }
    public Humano(){}

    public void saludar(){
        System.out.println("Hola guarrindonga, mi cedula es: "+ identificacion);
    }

    public void presentarse(){
        System.out.println("Mi nombre es: " + nombre);
    }

    public String estrato(int salario){
        if(salario == 0){
            return "0";
        }
        else{
            return "3";
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    
}
