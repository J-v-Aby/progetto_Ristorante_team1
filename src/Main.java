import java.util.List;

public class Main {
    public static void main(String[] args) {
        // HEADER
        System.out.println("\n\n\t\t\t" + UtilityColor.ANSI_YELLOW_BACKGROUND + UtilityColor.ANSI_BLACK + "  C O P P A  C I C U T I  " + UtilityColor.ANSI_RESET+ "\n");
        System.out.println("\n\t" + "Prezzo Medio: 50€\t" + "Recensioni: ⭐⭐⭐⭐⭐");
        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "A N T I P A S T I" + UtilityColor.ANSI_RESET + "\n");
        Menu menuCarne = new Menu("Carne", TipoMenu.CARNE);
        Menu menuPesce = new Menu("Pesce", TipoMenu.PESCE);
        Menu menuVegan = new Menu("Vegan", TipoMenu.VEGAN);


        Antipasti anti1 = new Antipasti("Carpaccio di manzo", 10.50, "Fettina di manzo crudo condita con succo di limone, servita con rucola e scaglie di parmigiano.",TipoPiatto.KM_ZERO, TipoMenu.CARNE);
        Antipasti anti2 = new Antipasti("Polpettine di carne al sugo", 12.00, "Polpettine di carne mista (manzo e maiale) in un sugo di pomodoro.", TipoPiatto.PIATTO_TIPICO,TipoMenu.CARNE);
        Antipasti anti3 = new Antipasti("Involtini di carne con verdure", 15.00, "Fettine di carne ripiene di verdure (carote, zucchine, peperoni) cotte in padella.", TipoPiatto.MENU_STANDARD, TipoMenu.CARNE);
        //pesce
        Antipasti anti4 = new Antipasti("Tartare di tonno", 18.50, "Tartare di tonno crudo condita con olio evo, succo di lime, sale e pepe, servita con avocado a cubetti.", TipoPiatto.KM_ZERO,TipoMenu.PESCE);
        Antipasti anti5 = new Antipasti("Crostini con salmone affumicato e formaggio", 20.50, "Crostini di pane tostato con salmone, formaggio fresco cremoso, erba cipollina e pepe.", TipoPiatto.MENU_STANDARD, TipoMenu.PESCE);
        Antipasti anti6 = new Antipasti("Gamberetti in salsa rosa", 22.00, "Gamberetti lessati serviti con salsa rosa (salsa a base di maionese, ketchup, brandy).", TipoPiatto.PIATTO_TIPICO,TipoMenu.PESCE);
        //vegan
        Antipasti anti7 = new Antipasti("Crostini con hummus e verdure grigliate", 8.50, "Crostini di pane tostato spalmati con hummus di ceci e verdure di stagione grigliate.", TipoPiatto.CONSIGLIATO_CHEF,TipoMenu.VEGAN);
        Antipasti anti8 = new Antipasti("Frittelle di zucchine e patate e salsa yogurt", 10.00, "Frittelle di zucchine e patate, servite con salsa allo yogurt vegetale (yogurt vegetale a base di soia o mandorle).", TipoPiatto.MENU_STANDARD,TipoMenu.VEGAN);
        Antipasti anti9 = new Antipasti("Involtini di melanzane con cous cous e verdure", 12.00, " Fettine di melanzane grigliate ripiene di cous cous con verdure di stagione cotte in padella.", TipoPiatto.BIOLOGICO,TipoMenu.VEGAN);

        menuCarne.addAntipasti(anti1);
        menuCarne.addAntipasti(anti2);
        menuCarne.addAntipasti(anti3);
        menuPesce.addAntipasti(anti4);
        menuPesce.addAntipasti(anti5);
        menuPesce.addAntipasti(anti6);
        menuVegan.addAntipasti(anti7);
        menuVegan.addAntipasti(anti8);
        menuVegan.addAntipasti(anti9);
        menuCarne.printAnti();








        // SECONDI
        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "S E C O N D I" + UtilityColor.ANSI_RESET + "\n");
        // Carne
        SecondiPiatti arrosto = new SecondiPiatti("Arrosto di Maiale al latte", 13.0, "morbido arrosto di maiale avvolto in una vellutata di latte e aromi", TipoMenu.CARNE);
        SecondiPiatti manzo = new SecondiPiatti("Manzo alla Stroganoff", 14.0, "straccetti di manzo cotti in una salsa di panna acida, senape e funghi", TipoMenu.CARNE);
        SecondiPiatti pollo = new SecondiPiatti("Pollo al curry", 9.0, "bocconcini di pollo in una salsa esotica di yogurt, curry e pomodoro", TipoMenu.CARNE);
        // Pesce
        SecondiPiatti salmone = new SecondiPiatti("Salmone e patate al forno", 14.0, "filetti di salmone al forno con patate dorati e profumati al limone", TipoMenu.PESCE);
        SecondiPiatti gamberi = new SecondiPiatti("Spiedini di gamberi e calamari", 13.0, "spiedini di gamberi e calamari grigliati e conditi con prezzemolo", TipoMenu.PESCE);
        SecondiPiatti orata = new SecondiPiatti("Sandwich di orata alla siciliana", 12.0, "panini senza glutine farciti con filetti di orata cotti al forno e una crema di pomodorini secchi, capperi e olive", TipoMenu.PESCE);
        // Vegan
        SecondiPiatti polpette = new SecondiPiatti("Polpette di lenticchie", 8.0, "polpette di lenticchie al forno o in padella con pane, aglio e prezzemolo", TipoMenu.VEGAN);
        SecondiPiatti tofu = new SecondiPiatti("Tofu e verdure alla piastra", 9.0, "fette di tofu alla piastra con paprika e verdure croccanti", TipoMenu.VEGAN);
        SecondiPiatti seitan = new SecondiPiatti("Seitan e funghi stufati", 10.0, "seitan stufato con funghi porcini, vino rosso, cipolla e rosmarino", TipoMenu.VEGAN);

        menuCarne.addSecondiPiatti(arrosto);
        menuCarne.addSecondiPiatti(manzo);
        menuCarne.addSecondiPiatti(pollo);
        menuPesce.addSecondiPiatti(salmone);
        menuPesce.addSecondiPiatti(gamberi);
        menuPesce.addSecondiPiatti(orata);
        menuVegan.addSecondiPiatti(polpette);
        menuVegan.addSecondiPiatti(tofu);
        menuVegan.addSecondiPiatti(seitan);
        menuCarne.printSecondi();

        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "D E S S E R T" + UtilityColor.ANSI_RESET + "\n");
        Dessert dessert1 = new Dessert("Creme Brulee", 2.30, "Crema inglese cotta e sormontata da una sfoglia croccante di zucchero caramellato", TipoMenu.CARNE);
        Dessert dessert2 = new Dessert("Cheesecake alle albicocche", 5.90, "Base di pasta biscotto su cui poggia un alto strato di crema di formaggio fresco con topping alle albicocche.", TipoMenu.CARNE);
        Dessert dessert3 = new Dessert("Cheesecake al cioccolato", 5.90, "Base di biscotto su cui poggia un alto strato di crema di formaggio fresco con topping al cioccolato.", TipoMenu.CARNE);
        Dessert dessert4 = new Dessert("Torta setteveli", 7.40, "Pan di Spagna (senza farina) di mandorle pugliesi, mousse di nocciole del Piemonte, \ncioccolato Madagascar e un fondo di gianduia croccante ai cereali", TipoMenu.CARNE);
        Dessert dessert5 = new Dessert("Strudel di mele", 6.38, "Un gustosissimo rotolo di pasta farcito con mele, uvetta, pinoli e cannella.", TipoMenu.VEGAN);
        Dessert dessert6 = new Dessert("Gelo di Anguria", 3.99, "Il gelo di mellone (gelu di muluni in siciliano), anche detto gelo d'anguria, \nè un tipico dolce al cucchiaio siciliano, tradizionalmente preparato a Ferragosto", TipoMenu.VEGAN);
        menuCarne.addDessert(dessert1);
        menuCarne.addDessert(dessert2);
        menuCarne.addDessert(dessert3);
        menuCarne.addDessert(dessert4);
        menuVegan.addDessert(dessert5);
        menuVegan.addDessert(dessert6);
        menuCarne.printDessert();

    }

}