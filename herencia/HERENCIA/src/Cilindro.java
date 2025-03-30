public class Cilindro extends Circulo {
    private float alto;

    public Cilindro(float radio, float alto){
        super(radio);
        this.alto = alto;
    }

    public float getArea(){
        return (float)(super.getArea() * alto);
    }
}
