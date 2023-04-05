import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tCOPPA CICUTI\n");
        antipasti();
        RistoMetodi.aggiuntaPrimi();
        RistoMetodi.aggiuntaSecondi();
        RistoMetodi.aggiuntaDessert();
        RistoMetodi.aggiuntaBevande();

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
