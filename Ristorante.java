public class Ristorante {
    public static void main(String[] args) {
        testSecondiPiatti();
    }

    public static void testSecondiPiatti() {

        SecondiPiatti agnello = new SecondiPiatti("Agnello in crosta di pane allo zafferano", 22, "Agnello in crosta di pane allo zafferano servito \n\tsu un letto di composta di cipolla rossa di tropea e battuta di menta");
        SecondiPiatti filettoWell = new SecondiPiatti("Filetto alla Wellington", 27, "Filetto di Manzo in Pasta sfoglia con funghi e prosciutto crudo, \n\tservito su una riduzione di fondo bruno");
        SecondiPiatti polloAgro = new SecondiPiatti("Bocconcini di pollo in Agrodolce al timo", 15, "Bocconcini di petto di pollo in salsa agrodolce \n\tcon riduzione di brodo vegetale al timo");
        SecondiPiatti tarTare = new SecondiPiatti("Tartare di Manzo", 19, "Tartare di manzo con vinagrette, \n\tfunghi, rucola e scaglie di grana");
        SecondiPiatti spezzaVitello = new SecondiPiatti("Spezzatino di vitello con verdure", 16, "Bocconcini di vitello in brodo con \n\tdadolatura di verdure");

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tSECONDI PIATTI:\n\n\t"+agnello.getNome().toUpperCase()+"\t"+agnello.getPrezzo()+" € \n\t" + agnello.getIngredienti() + "\n" );
        System.out.println("\n\t"+ filettoWell.getNome().toUpperCase()+"\t"+filettoWell.getPrezzo()+" € \n\t" + filettoWell.getIngredienti() + "\n" );
        System.out.println("\n\t"+ polloAgro.getNome().toUpperCase()+"\t"+polloAgro.getPrezzo()+" € \n\t" + polloAgro.getIngredienti() + "\n" );
        System.out.println("\n\t"+ tarTare.getNome().toUpperCase()+"\t"+tarTare.getPrezzo()+" € \n\t" + tarTare.getIngredienti() + "\n" );
        System.out.println("\n\t"+ spezzaVitello.getNome().toUpperCase()+"\t"+spezzaVitello.getPrezzo()+" € \n\t" + spezzaVitello.getIngredienti() + "\n" );
    }

}
