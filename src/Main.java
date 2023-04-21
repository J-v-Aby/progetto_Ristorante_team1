public class Main {
    public static void main(String[] args) {
//        // HEADER
        System.out.println("\n\n\t\t\t" + UtilityColor.ANSI_YELLOW_BACKGROUND + UtilityColor.ANSI_BLACK + "  C O P P A  C I C U T I  " + UtilityColor.ANSI_RESET + "\n");
        System.out.println("\t\t\t" + "L'esperienza che ferma il tempo\n" +
                "Le lancette rallentano il loro avanzare, nell’aria il racconto di piatti che emozionano al primo sguardo." + "\n" + " Danzatori silenziosi si muovono intorno a te per regalarti lo spettacolo di un servizio impeccabile," + "\n" + " in una cornice di dettagli moreschi che parlano di storie antiche: signore e signori, benvenuti nel Ristorante di Coppa Cicuti.");
        System.out.println("\n\t" + "Prezzo Medio: 50€\t" + "Recensioni: ⭐⭐⭐⭐⭐");
        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "A N T I P A S T I" + UtilityColor.ANSI_RESET + "\n");
        Menu menuCarne = new Menu("Carne", TipoMenu.CARNE);
        Menu menuPesce = new Menu("Pesce", TipoMenu.PESCE);
        Menu menuVegan = new Menu("Vegan", TipoMenu.VEGAN);

        //carne
        Antipasti anti1 = new Antipasti("Carpaccio di manzo", 10.50, "Fettina di manzo crudo condita con succo di limone, servita con rucola e scaglie di parmigiano.", "Slice of raw beef seasoned with lemon juice, served with rocket and parmesan flakes.", TipoPiatto.KM_ZERO);
        Antipasti anti2 = new Antipasti("Polpettine di carne al sugo", 12.00, "Polpettine di carne mista (manzo e maiale) in un sugo di pomodoro.", "Mixed meatballs (beef and pork) in a tomato sauce.", TipoPiatto.PIATTO_TIPICO);
        Antipasti anti3 = new Antipasti("Involtini di carne con verdure", 15.00, "Fettine di carne ripiene di verdure (carote, zucchine, peperoni) cotte in padella.", "Slices of meat stuffed with vegetables (carrots, courgettes, peppers) cooked in a pan.", TipoPiatto.MENU_STANDARD);
        //pesce
        Antipasti anti4 = new Antipasti("Tartare di tonno", 18.50, "Tartare di tonno crudo condita con olio evo, succo di lime, sale e pepe, servita con avocado a cubetti.", "Raw tuna tartare seasoned with extra virgin olive oil, lime juice, salt and pepper, served with diced avocado.", TipoPiatto.KM_ZERO);
        Antipasti anti5 = new Antipasti("Crostini con salmone affumicato e formaggio", 20.50, "Crostini di pane tostato con salmone, formaggio fresco cremoso, erba cipollina e pepe.", "Toasted croutons with salmon, fresh cream cheese, chives and pepper.", TipoPiatto.MENU_STANDARD);
        Antipasti anti6 = new Antipasti("Gamberetti in salsa rosa", 22.00, "Gamberetti lessi serviti con salsa rosa (salsa a base di maionese, ketchup, brandy).", "Boiled prawns served with pink sauce (mayonnaise-based sauce, ketchup, brandy).", TipoPiatto.PIATTO_TIPICO);
        //vegan
        Antipasti anti7 = new Antipasti("Crostini con hummus e verdure grigliate", 8.50, "Crostini di pane tostato spalmati con hummus di ceci e verdure di stagione grigliate.", "Toasted croutons spread with chickpea hummus and grilled seasonal vegetables.", TipoPiatto.CONSIGLIATO_CHEF);
        Antipasti anti8 = new Antipasti("Frittelle di zucchine e patate e salsa yogurt", 10.00, "Frittelle di zucchine e patate, servite con salsa allo yogurt vegetale (yogurt vegetale a base di soia o mandorle).", "Courgette and potato fritters, served with vegetable yoghurt sauce (soy or almond-based vegetable yoghurt).", TipoPiatto.MENU_STANDARD);
        Antipasti anti9 = new Antipasti("Involtini di melanzane con cous cous e verdure", 12.00, "Fettine di melanzane grigliate ripiene di cous cous con verdure di stagione cotte in padella.", "Slices of grilled aubergines filled with cous cous with seasonal vegetables cooked in a pan.", TipoPiatto.BIOLOGICO);

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


        //PRIMI
        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "P R I M I" + UtilityColor.ANSI_RESET + "\n");
        //Carne
        PrimiPiatti primiPiatti1 = new PrimiPiatti("Cannelloni alla genovese e sedano ", 13.0, "cannelloni  ripieni di carne e sedano croccante gratinati al forno ",true, 60);
        PrimiPiatti primiPiatti2 = new PrimiPiatti("Ravioli di coniglio ", 16.5, "ravioli  ripieni di coniglio e aromi conditi con burro e salvia",true,12 );
        PrimiPiatti primiPiatti3 = new PrimiPiatti("Risotto d’autunno ", 15.0, "risotto con castagne mele e capocollo profumato con rosmarino ",true,20 );
        //Pesce
        PrimiPiatti primiPiatti4 = new PrimiPiatti("Risotto all’onda con velo di gamberi crudi", 13.5, "risotto cremoso con gamberi crudi e zafferano ",false,20 );
        PrimiPiatti primiPiatti5 = new PrimiPiatti("Paccheri, anelli di calamari, pomodoro pachino e salicornia", 15.0, "paccheri con calamari pomodoro e salicornia conditi con olio extravergine d’oliva ",true,15 );
        PrimiPiatti primiPiatti6 = new PrimiPiatti("Linguine con capesante, tartufo bianco e basilico", 14.0, "linguine con capesante tartufo bianco e basilico conditi con olio extravergine d’oliva ", false,15);
        //Vegan
        PrimiPiatti primiPiatti7 = new PrimiPiatti("Ravioli vegani di barbabietole con mele e noci", 12.5, "ravioli vegani ripieni di barbabietole mele e noci conditi con burro e salvia ",true,15 );
        PrimiPiatti primiPiatti8 = new PrimiPiatti("Spaghetti al pesto di avocado, basilico e pinoli", 13.0, "spaghetti al pesto di avocado basilico e pinoli conditi con olio extravergine d’oliva ",true,15 );
        PrimiPiatti primiPiatti9 = new PrimiPiatti("Conchiglioni con broccoli e mandorle", 14.5, "conchiglioni ripieni di broccoli e mandorle gratinati al forno ",true,25 );

        primiPiatti1.getListaAllergeni().add(Allergeni.SEDANO);
        primiPiatti2.getListaAllergeni().add(Allergeni.LATTE);
        primiPiatti4.getListaAllergeni().add(Allergeni.CROSTACEI);
        primiPiatti5.getListaAllergeni().add(Allergeni.NICKEL);
        primiPiatti6.getListaAllergeni().add(Allergeni.MOLLUSCHI);
        primiPiatti7.getListaAllergeni().add(Allergeni.FRUTTA_A_GUSCIO);
        primiPiatti8.getListaAllergeni().add(Allergeni.GLUTINE);
        primiPiatti9.getListaAllergeni().add(Allergeni.FRUTTA_A_GUSCIO);

        menuCarne.addPrimiPiatti(primiPiatti1);
        menuCarne.addPrimiPiatti(primiPiatti2);
        menuCarne.addPrimiPiatti(primiPiatti3);
        menuPesce.addPrimiPiatti(primiPiatti4);
        menuPesce.addPrimiPiatti(primiPiatti5);
        menuPesce.addPrimiPiatti(primiPiatti6);
        menuVegan.addPrimiPiatti(primiPiatti7);
        menuVegan.addPrimiPiatti(primiPiatti8);
        menuVegan.addPrimiPiatti(primiPiatti9);
        menuCarne.printPrimi();


        // SECONDI
        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "S E C O N D I" + UtilityColor.ANSI_RESET + "\n");
        // Carne
        SecondiPiatti arrosto = new SecondiPiatti("Arrosto di Maiale al latte", 13.0, "morbido arrosto di maiale avvolto in una vellutata di latte e aromi", "Patate al forno", Cottura.COTTA);
        SecondiPiatti manzo = new SecondiPiatti("Manzo alla Stroganoff", 14.0, "straccetti di manzo cotti in una salsa di panna acida, senape e funghi", "Verdure", Cottura.MEDIA);
        SecondiPiatti pollo = new SecondiPiatti("Pollo al curry", 9.0, "bocconcini di pollo in una salsa esotica di yogurt, curry e pomodoro", "Insalata", Cottura.COTTA);
        // Pesce
        SecondiPiatti salmone = new SecondiPiatti("Salmone al limone", 14.0, "filetti di salmone al forno profumati al limone", "Patate al forno", Cottura.SANGUE);
        SecondiPiatti gamberi = new SecondiPiatti("Spiedini di gamberi e calamari", 13.0, "spiedini di gamberi e calamari grigliati e conditi con prezzemolo", "Insalata", Cottura.COTTA);
        SecondiPiatti orata = new SecondiPiatti("Sandwich di orata alla siciliana", 12.0, "panini senza glutine farciti con filetti di orata cotti al forno e una crema di pomodorini secchi, capperi e olive", "Patatine fritte", Cottura.MEDIA);
        // Vegan
        SecondiPiatti polpette = new SecondiPiatti("Polpette di lenticchie", 8.0, "polpette di lenticchie al forno o in padella con pane, aglio e prezzemolo", "Verdure", Cottura.COTTA);
        SecondiPiatti tofu = new SecondiPiatti("Tofu piccante", 9.0, "fette di tofu alla piastra con limone e peperoncino", "Verdure croccanti alla piastra", Cottura.MEDIA);
        SecondiPiatti seitan = new SecondiPiatti("Seitan al vino Rosso", 10.0, "seitan stufato con vino rosso, cipolla, rosmarino e senape", "Funghi porcini", Cottura.MEDIA);

        arrosto.getListaAllergeni().add(Allergeni.LATTE);
        manzo.getListaAllergeni().add(Allergeni.LATTE);
        pollo.getListaAllergeni().add(Allergeni.ARACHIDI);

        salmone.getListaAllergeni().add(Allergeni.PESCE);
        gamberi.getListaAllergeni().add(Allergeni.PESCE);
        orata.getListaAllergeni().add(Allergeni.PESCE);
        orata.getListaAllergeni().add(Allergeni.GLUTINE);

        seitan.getListaAllergeni().add(Allergeni.SENAPE);


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
        Dessert dessert1 = new Dessert("Creme Brulee", 2.30, "Crema inglese cotta e sormontata da una sfoglia croccante di zucchero caramellato", TipoDessert.CREMA, ChefStellati.MARIO_PARMEGGIANI, "panna fresca liquida, latte, tuorli, zucchero, baccello di vaniglia");
        Dessert dessert2 = new Dessert("Cheesecake alle albicocche", 5.90, "Base di pasta biscotto su cui poggia un alto strato di crema di formaggio fresco con topping alle albicocche.", TipoDessert.FRUTTA, ChefStellati.MARIO_PARMEGGIANI, "biscotti g.free, burro, philadelphia, panna fresca, zucchero gelatina alimentare, bacche di vaniglia, confettura di albicocca");
        Dessert dessert3 = new Dessert("Cheesecake al cioccolato", 5.90, "Base di biscotto su cui poggia un alto strato di crema di formaggio fresco con topping al cioccolato.", TipoDessert.CIOCCOLATO, ChefStellati.MARCUS_SAMUELSSON, "biscotti, burro, philadelphia, panna fresca, zucchero gelatina alimentare, bacche di vaniglia, crema di cioccolato, scaglie di cioccolato fondente");
        Dessert dessert4 = new Dessert("Torta setteveli", 7.40, "Pan di Spagna, mandorle pugliesi, mousse di nocciole del Piemonte, \ncioccolato Madagascar e un fondo di gianduia croccante ai cereali", TipoDessert.CIOCCOLATO, ChefStellati.MARCUS_SAMUELSSON, "uova, zucchero, farina, cacao, crema nocciola,cereali al cioccolato,amido di riso, latte, gelatia, panna, pasta di nocciole,cioccolato fondente, schiroppo di glucosio");
        Dessert dessert5 = new Dessert("Strudel di mele", 6.38, "Un gustosissimo rotolo di pasta farcito con mele, uvetta, pinoli e cannella.", TipoDessert.FRUTTA, ChefStellati.VICKY_LAU, "mele, uvetta, marsala o vermouth, confettura di albicocca, mandorle, panna veggetale, zucchero, cannella");
        Dessert dessert6 = new Dessert("Gelo di Anguria", 3.99, "Il gelo di mellone (gelu di muluni in siciliano), anche detto gelo d'anguria, \nè un tipico dolce al cucchiaio siciliano, tradizionalmente preparato a Ferragosto", TipoDessert.FRUTTA, ChefStellati.VICKY_LAU, "succo di anguria amido di frumento, zucchero di canna, anice, gocce di cioccolato fondente");

        menuCarne.addDessert(dessert1);
        menuCarne.addDessert(dessert2);
        menuCarne.addDessert(dessert3);
        menuCarne.addDessert(dessert4);
        menuVegan.addDessert(dessert5);
        menuVegan.addDessert(dessert6);
        menuCarne.printDessert();

        System.out.println("\n\n" + UtilityColor.ANSI_BOLD + "B E V A N D E" + UtilityColor.ANSI_RESET + "\n");
        Bevande acqua = new Bevande("Acqua naturale 0.5l", 1.00, "Acqua di Nepi", false);
        Bevande acquaG = new Bevande("Acqua naturale 1l", 2.00, "Boario", false);
        Bevande acquaFrizzante = new Bevande("Acqua frizzante 0.5l", 1.00, "Guizza", false);
        Bevande acquaFrizzanteG = new Bevande("Acqua frizzante 1l ", 2.00, "Natia", false);
        Bevande cocaColaL = new Bevande("Coca Cola", 2.00, "Lattina da 33cl", false);
        Bevande cocaColaB = new Bevande("Coca Cola bottiglia", 4.00, "Bottiglia da 1.5l", false);
        Bevande sprite = new Bevande("Sprite", 2.00, "Lattina da 33cl", false);
        Bevande fanta = new Bevande("Fanta", 2.00, "Lattina da 33cl", false);
        Bevande birraBionda = new Bevande("Birra bionda 0.25 cl", 4.00, "Helles", true);
        Bevande birraBiondaG = new Bevande("Birra bionda 0.50 cl", 5.00, "Golden Ale", true);
        Bevande birraRossa = new Bevande("Birra rossa 0.25cl", 4.00, "Peroni Gran Riserva", true);
        Bevande birraRossaG = new Bevande("Birra rossa 0.5cl", 5.00, "McFarland", true);

        menuCarne.addBevande(acqua);
        menuCarne.addBevande(acquaG);
        menuCarne.addBevande(acquaFrizzante);
        menuCarne.addBevande(acquaFrizzanteG);
        menuCarne.addBevande(cocaColaL);
        menuCarne.addBevande(cocaColaB);
        menuCarne.addBevande(sprite);
        menuCarne.addBevande(fanta);
        menuCarne.addBevande(birraBionda);
        menuCarne.addBevande(birraBiondaG);
        menuCarne.addBevande(birraRossa);
        menuCarne.addBevande(birraRossaG);
        menuCarne.printBevande();


    }
}