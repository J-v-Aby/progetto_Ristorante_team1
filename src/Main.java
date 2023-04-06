import java.util.List;

public class Main {
    public static void main(String[] args) {

//      RistoMetodi.aggiuntaAntipasti();
        RistoMetodi.aggiuntaPrimi();
        RistoMetodi.aggiuntaSecondi();
        RistoMetodi.aggiuntaDessert();
        RistoMetodi.aggiuntaBevande();

        // test per stampare menù carne;
        RistoMetodi.printMenuSpecifico(ListeMenu.getCarneList());

//      RistoMetodi.mapping();

    }
//    public static void antipasti() {
//        Antipasti antipasto1 = new Antipasti("Parfait di foie gras con cuore di aceto balsamico", 7.50);
//        Antipasti antipasto2 = new Antipasti("Insalata liquida di scarola, stracciatella di bufala", 6.50);
//        Antipasti antipasto3 = new Antipasti("Crostini di pollo in gelatina di limone", 9.00);
//        Antipasti antipasto4 = new Antipasti("Lumache lardellate con crema di cavolfiori", 12.00);
//        Antipasti antipasto5 = new Antipasti("Agnello mantecato con chips di polenta", 8.00);
//    }
}
