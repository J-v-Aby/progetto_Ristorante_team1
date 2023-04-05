import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tCOPPA CICUTI\n");
        antipasti();
        primiPiatti();
        RistoMetodi.aggiuntaSecondi();
        dessert();
        creazioneBevande();

    }

    public static void creazioneBevande() {
        Bevande acqua = new Bevande("Acqua", 1.50, false);
        Bevande acquaFrizzante = new Bevande("Acqua frizzante", 1.00, false);
        Bevande cocaCola = new Bevande("Coca Cola", 2.00, false);
        Bevande sprite = new Bevande("Sprite", 2.00, false);
        Bevande fanta = new Bevande("Fanta", 2.00, false);
        Bevande birraBionda = new Bevande("Birra bionda 0.5cl", 4.00, true);
        Bevande birraRossa = new Bevande("Birra rossa 0.5cl", 4.00, true);

        System.out.println("\nBevande:");
        acqua.printBevanda();
        acquaFrizzante.printBevanda();
        cocaCola.printBevanda();
        sprite.printBevanda();
        fanta.printBevanda();
        birraBionda.printBevanda();
        birraRossa.printBevanda();
    }

    private static void dessert() {
        Dessert dessert1 = new Dessert("Creme Brulee", 2.50f);
        Dessert dessert2 = new Dessert("Cheesecake alle albicocche", 6.00f);
        Dessert dessert3 = new Dessert("Coppette agli amaretti", 7.50f);
        Dessert dessert4 = new Dessert("Sfoglia con Ananas sciroppata", 6.5f);
        Dessert dessert5 = new Dessert("Macedonia di Anguria", 4.00f);

        System.out.println("\nDessert:");
        System.out.println(dessert1.getNome() + " " + dessert1.getPrezzo() + "€");
        System.out.println(dessert2.getNome() + " " + dessert2.getPrezzo() + "€");
        System.out.println(dessert3.getNome() + " " + dessert3.getPrezzo() + "€");
        System.out.println(dessert4.getNome() + " " + dessert4.getPrezzo() + "€");
        System.out.println(dessert5.getNome() + " " + dessert5.getPrezzo() + "€");
    }


    private static void primiPiatti() {
        PrimiPiatti primiPiatti1 = new PrimiPiatti("Tagliatelle alla Bolognese", 13F);
        PrimiPiatti primiPiatti2 = new PrimiPiatti("Lasagna in crema con prosciutto affumicato", 16.50F);
        PrimiPiatti primiPiatti3 = new PrimiPiatti("Cappelletti in brodo di cappone", 15F);
        PrimiPiatti primiPiatti4 = new PrimiPiatti("Spaghetti alla glassa", 13.50F);
        PrimiPiatti primiPiatti5 = new PrimiPiatti("Ravioli prosciutto crudo alle erbe", 15F);

        System.out.println("\nPrimi Piatti:" +
                "\n" + primiPiatti1.getNome() + " " + primiPiatti1.getPrezzo() + "€" +
                "\n" + primiPiatti2.getNome() + " " + primiPiatti2.getPrezzo() + "€" +
                "\n" + primiPiatti3.getNome() + " " + primiPiatti3.getPrezzo() + "€" +
                "\n" + primiPiatti4.getNome() + " " + primiPiatti4.getPrezzo() + "€" +
                "\n" + primiPiatti5.getNome() + " " + primiPiatti5.getPrezzo() + "€");
    }

    public static void antipasti() {
        Antipasti antipasto1 = new Antipasti("Parfait di foie gras con cuore di aceto balsamico", 7.50f);
        Antipasti antipasto2 = new Antipasti("Insalata liquida di scarola, stracciatella di bufala", 6.50f);
        Antipasti antipasto3 = new Antipasti("Crostini di pollo in gelatina di limone", 9.00f);
        Antipasti antipasto4 = new Antipasti("Lumache lardellate con crema di cavolfiori", 12.00f);
        Antipasti antipasto5 = new Antipasti("Agnello mantecato con chips di polenta", 8.00f);



        System.out.println("\nAntipasti: " +
                "\n" + antipasto1.getNome() + " " + antipasto1.getPrezzo() + "€" +
                "\n" + antipasto2.getNome() + " " + antipasto2.getPrezzo() + "€" +
                "\n" + antipasto3.getNome() + " " + antipasto3.getPrezzo() + "€" +
                "\n" + antipasto4.getNome() + " " + antipasto4.getPrezzo() + "€" +
                "\n" + antipasto5.getNome() + " " + antipasto5.getPrezzo() + "€");

        antipasto1.print();
    }
}
