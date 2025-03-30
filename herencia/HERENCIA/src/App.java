public class App {
    public static void main(String[] args) throws Exception {
        
        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.getArea());

        Cilindro cilindro1 = new Cilindro(6.7f, 8f);
        System.out.println(cilindro1.getArea());
    }
}
