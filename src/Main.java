import java.util.List;

public class Main {
    public static void main(String[] args) {

        RistoMetodi.aggiuntaAntipasti();
        RistoMetodi.aggiuntaPrimi();
        RistoMetodi.aggiuntaSecondi();
        RistoMetodi.aggiuntaDessert();
        RistoMetodi.aggiuntaBevande();

        // test per stampare menù carne;
        RistoMetodi.printMenuSpecifico(ListeMenu.getCarneList());

//      RistoMetodi.mapping();

    }
}