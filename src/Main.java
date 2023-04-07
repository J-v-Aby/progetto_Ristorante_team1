import java.util.List;

public class Main {
    public static void main(String[] args) {

        // NON TOCCARE ☠️ metodi per aggiungere i piatti nelle liste
        Antipasti anti1 = new Antipasti("Carpaccio di manzo", 10.50, "Fettina di manzo crudo condita con succo di limone, servita con rucola e scaglie di parmigiano.", 1);

        Antipasti anti2 = new Antipasti("Polpettine di carne al sugo", 12.00, "Polpettine di carne mista (manzo e maiale) in un sugo di pomodoro.", 1);

        Antipasti anti3 = new Antipasti("Involtini di carne con verdure", 15.00, "Fettine di carne ripiene di verdure (carote, zucchine, peperoni) cotte in padella.", 1);

        //pesce
        Antipasti anti4 = new Antipasti("Tartare di tonno", 18.50, "Tartare di tonno crudo condita con olio evo, succo di lime, sale e pepe, servita con avocado a cubetti.", 2);

        Antipasti anti5 = new Antipasti("Crostini con salmone affumicato e formaggio", 20.50, "Crostini di pane tostato con salmone, formaggio fresco cremoso, erba cipollina e pepe.", 2);

        Antipasti anti6 = new Antipasti("Gamberetti in salsa rosa", 22.00, "Gamberetti lessati serviti con salsa rosa (salsa a base di maionese, ketchup, brandy).", 2);

        //vegan
        Antipasti anti7 = new Antipasti("Crostini con hummus e verdure grigliate", 8.50, "Crostini di pane tostato spalmati con hummus di ceci e verdure di stagione grigliate.", 3);

        Antipasti anti8 = new Antipasti("Frittelle di zucchine e patate e salsa yogurt", 10.00, "Frittelle di zucchine e patate, servite con salsa allo yogurt vegetale (yogurt vegetale a base di soia o mandorle).", 3);

        Antipasti anti9 = new Antipasti("Involtini di melanzane con cous cous e verdure", 12.00, " Fettine di melanzane grigliate ripiene di cous cous con verdure di stagione cotte in padella.", 3);

        Menu menu = new Menu("cheneso", "carne");

        menu.addAntipasti(anti1);
        menu.addAntipasti(anti9);
        menu.addAntipasti(anti3);

        menu.printAntipasti();



    }
}