import java.util.List;

public class Main {
    public static void main(String[] args) {

        RistoMetodi.aggiuntaAntipasti();
        RistoMetodi.aggiuntaPrimi();
        RistoMetodi.aggiuntaSecondi();
        RistoMetodi.aggiuntaDessert();
        RistoMetodi.aggiuntaBevande();

        // test per stampare menù CARNE, bevande e dolci;
        RistoMetodi.printMenuSpecifico(ListeMenu.getCarneList());

        // test per stampare menù PESCE, bevande e dolci;
//        RistoMetodi.printMenuSpecifico(ListeMenu.getPesceList());

        // test per stampare menù VEGAN, bevande e dolci;
//        RistoMetodi.printMenuSpecifico(ListeMenu.getVeganList());

//      RistoMetodi.mapping();

    }
}