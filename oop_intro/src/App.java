public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String universidad = "DEL VALLE";
        boolean voyAGanarEventos = true;

        Humano humano1 = new Humano();
        Humano humano2 = new Humano("Gabox", (byte)20, "1234566");
        System.out.println("Hola puñeta");
        System.out.println(humano2.getNombre());
        System.out.println(humano1.getNombre());
        System.out.println(humano1.getEdad());

        humano1.setNombre("fofi");
        humano1.setEdad((byte)33);

        humano1.saludar();
        humano2.saludar();
        humano1.presentarse();
        humano2.presentarse();
     
        //System.out.println(humano1.estrato(2000000));
        //String estratoSofia = humano1.estrato(2000000);
        //System.out.println(estratoSofia);
    }
    
}
