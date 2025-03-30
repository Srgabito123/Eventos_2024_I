import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Elefante orejas = new Elefante();
        Perro pirulo = new Perro();
        Loro jaimito = new Loro("Jaimito pro", "verde", "español",
         "veneco");
        Torcasa camilaFina = new Torcasa("Camila Fina", "Leproso");

        ArrayList <Pajaro> lista = new ArrayList<Pajaro>();
        lista.add(jaimito);
        lista.add(camilaFina);

        System.out.println("Así cantan los pajaros: ");
        for(Pajaro pajaro : lista){
            pajaro.cantar();
        }
        
        ArrayList <Mascota> listaMacotas = new ArrayList<Mascota>();
        listaMacotas.add(jaimito);
        listaMacotas.add(pirulo);
        for(Mascota mascotas : listaMacotas){
            System.out.println(mascotas.getDueño());
            System.out.println(mascotas.getFechaDeVacunacion());
        }

        ArrayList <AnimalDeCirco> listaAnimalesCirco = new ArrayList<AnimalDeCirco>();
        listaAnimalesCirco.add(jaimito);
        listaAnimalesCirco.add(orejas);

        for(AnimalDeCirco animalDelCirco : listaAnimalesCirco){
            animalDelCirco.hacerTruco();
            animalDelCirco.despedirse();
        }

    }
}
