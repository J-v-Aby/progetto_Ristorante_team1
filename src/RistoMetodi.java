public class RistoMetodi {


    /**
     * Metodo che, verificando la tipologia di portata,
     * l'aggiunge nella lista corrispondente
     *
     * @param portata
     */
    public static void addPortataToMenu(Menu portata) {

        // controllo se la portata è di CARNE;
        if (portata.getAntipasti() != null && portata.getAntipasti().getCheckTipoMenu() == 1
                || portata.getPrimiPiatti() != null && portata.getPrimiPiatti().getCheckTipoMenu() == 1
                || portata.getSecondiPiatti() != null && portata.getSecondiPiatti().getCheckTipoMenu() == 1) {
            ListeMenu.getCarneList().add(portata);
        }
        // controllo se la portata è di PESCE;
        if (portata.getAntipasti() != null && portata.getAntipasti().getCheckTipoMenu() == 2
                || portata.getPrimiPiatti() != null && portata.getPrimiPiatti().getCheckTipoMenu() == 2
                || portata.getSecondiPiatti() != null && portata.getSecondiPiatti().getCheckTipoMenu() == 2) {
            ListeMenu.getPesceList().add(portata);
        }
        // controllo se la portata è VEGAN;
        if (portata.getAntipasti() != null && portata.getAntipasti().getCheckTipoMenu() == 3
                || portata.getPrimiPiatti() != null && portata.getPrimiPiatti().getCheckTipoMenu() == 3
                || portata.getSecondiPiatti() != null && portata.getSecondiPiatti().getCheckTipoMenu() == 3) {
            ListeMenu.getVeganList().add(portata);
        }
        // controllo se la portata è una BEVANDA;
        if (portata.getBevande() != null && portata.getBevande().getCheckTipoMenu() == 4) {
            ListeMenu.getBevandeList().add(portata);
        }
        // controllo se la portata è un DOLCE;
        if (portata.getDessert() != null && portata.getDessert().getCheckTipoMenu() == 5) {
            ListeMenu.getDolciList().add(portata);
        }
    }
    public static void aggiuntaPrimi(){
        PrimiPiatti primiPiatti1 = new PrimiPiatti("Cannelloni alla genovese e sedano ", 13.0,"cannelloni ripieni di carne e sedano croccante, gratinati al forno ",1);
        Menu cannelloni = new Menu(primiPiatti1);
        PrimiPiatti primiPiatti2 = new PrimiPiatti("Ravioli di coniglio ", 16.5,"ravioli ripieni di coniglio e aromi, conditi con burro e salvia",1);
        Menu ravioliC = new Menu(primiPiatti2);
        PrimiPiatti primiPiatti3 = new PrimiPiatti("Risotto d’autunno ", 15.0,"risotto con castagne, mele e capocollo, profumato con rosmarino ",1);
        Menu risottoA = new Menu(primiPiatti3);
        PrimiPiatti primiPiatti4 = new PrimiPiatti("Risotto all’onda con velo di gamberi crudi", 13.5,"risotto cremoso con gamberi crudi e zafferano ",2);
        Menu risottoO = new Menu(primiPiatti4);
        PrimiPiatti primiPiatti5 = new PrimiPiatti("Paccheri, anelli di calamari, pomodoro pachino e salicornia", 15.0,"paccheri con calamari, pomodoro e salicornia, conditi con olio extravergine d’oliva ",2);
        Menu paccheri = new Menu(primiPiatti5);
        PrimiPiatti primiPiatti6 = new PrimiPiatti("Linguine con capesante, tartufo bianco e basilico",14.0,"linguine con capesante, tartufo bianco e basilico, conditi con olio extravergine d’oliva ",2);
        Menu linguine = new Menu(primiPiatti6);
        PrimiPiatti primiPiatti7 = new PrimiPiatti("Ravioli vegani di barbabietole con mele e noci",12.5,"ravioli vegani ripieni di barbabietole, mele e noci, conditi con burro e salvia ",3);
        Menu ravioliV = new Menu(primiPiatti7);
        PrimiPiatti primiPiatti8 = new PrimiPiatti("Spaghetti al pesto di avocado, basilico e pinoli",13.0,"spaghetti al pesto di avocado, basilico e pinoli, conditi con olio extravergine d’oliva ",3);
        Menu spaghetti = new Menu(primiPiatti8);
        PrimiPiatti primiPiatti9 = new PrimiPiatti("Conchiglioni con broccoli e mandorle",14.5,"conchiglioni ripieni di broccoli e mandorle, gratinati al forno ",3);
        Menu conchiglioni = new Menu(primiPiatti9);

        addPortataToMenu(cannelloni);
        addPortataToMenu(ravioliC);
        addPortataToMenu(risottoA);
        addPortataToMenu(risottoO);
        addPortataToMenu(paccheri);
        addPortataToMenu(linguine);
        addPortataToMenu(ravioliV);
        addPortataToMenu(spaghetti);
        addPortataToMenu(conchiglioni);

    }

    public static void aggiuntaSecondi(){
        // Carne
        SecondiPiatti arrosto0 = new SecondiPiatti("Arrosto di Maiale al latte", 13.0, "morbido arrosto di maiale avvolto in una vellutata di latte e aromi", 1);
        Menu arrosto = new Menu(arrosto0);

        SecondiPiatti manzo1 = new SecondiPiatti("Manzo alla Stroganoff", 14.0, "straccetti di manzo cotti in una salsa di panna acida, senape e funghi",  1);
        Menu manzo = new Menu(manzo1);

        SecondiPiatti pollo0 = new SecondiPiatti("Pollo al curry", 9.0, "bocconcini di pollo in una salsa esotica di yogurt, curry e pomodoro", 1);
        Menu pollo = new Menu(pollo0);

        // Pesce
        SecondiPiatti salmone0 = new SecondiPiatti("Salmone e patate al forno", 14.0, "filetti di salmone al forno con patate dorati e profumati al limone", 2);
        Menu salmone = new Menu(salmone0);

        SecondiPiatti gamberi0 = new SecondiPiatti("Spiedini di gamberi e calamari", 13.0, "spiedini di gamberi e calamari grigliati e conditi con prezzemolo", 2);
        Menu gamberi = new Menu(gamberi0);

        SecondiPiatti orata0 = new SecondiPiatti("Sandwich di orata alla siciliana", 12.0, "panini senza glutine farciti con filetti di orata cotti al forno e una crema di pomodorini secchi, capperi e olive", 2);
        Menu orata = new Menu(orata0);

        // Vegan
        SecondiPiatti polpette0 = new SecondiPiatti("Polpette di lenticchie", 8.0, "polpette di lenticchie al forno o in padella con pane, aglio e prezzemolo", 3);
        Menu polpette = new Menu(polpette0);

        SecondiPiatti tofu0 = new SecondiPiatti("Tofu e verdure alla piastra", 9.0, "fette di tofu alla piastra con paprika e verdure croccanti", 3);
        Menu tofu = new Menu(tofu0);

        SecondiPiatti seitan0 = new SecondiPiatti("Seitan e funghi stufati", 10.0, "seitan stufato con funghi porcini, vino rosso, cipolla e rosmarino", 3);
        Menu seitan = new Menu(seitan0);

        // aggiunta alla lista corrispondente;
        // Carne
        addPortataToMenu(arrosto);
        addPortataToMenu(manzo);
        addPortataToMenu(pollo);
        // Pesce
        addPortataToMenu(salmone);
        addPortataToMenu(gamberi);
        addPortataToMenu(orata);
        // Vegan
        addPortataToMenu(polpette);
        addPortataToMenu(tofu);
        addPortataToMenu(seitan);



    }

    public static void aggiuntaDessert (){
        Dessert dessert1 = new Dessert("Creme Brulee", 2.30, "è una crema formata da una base di crema inglese cotta e sormontata da una sfoglia croccante di zucchero caramellato", 5 );
        Menu crema= new Menu(dessert1);

        Dessert dessert2 = new Dessert("Cheesecake alle albicocche", 5.90, "è un dolce freddo composto da una base di pasta biscotto su cui poggia un alto strato di crema di formaggio fresco, zuccherato e trattato con altri ingredienti.", 5);
        Menu albicocca= new Menu(dessert2);

        Dessert dessert6 = new Dessert("Cheesecake al cioccolato", 5.90,"è un dolce freddo composto da una base di pasta biscotto su cui poggia un alto strato di crema di formaggio fresco, zuccherato e trattato con altri ingredienti.",5);
        Menu cioccolato= new Menu(dessert6);

        Dessert dessert3 = new Dessert("Torta setteveli", 7.40, "Questa torta è composta da una base di pan di Spagna (senza farina) di mandorle pugliesi, mousse di nocciole del Piemonte, cioccolato Madagascar e un fondo di gianduia croccante ai cereali",5);
        Menu veli= new Menu(dessert3);

        Dessert dessert4 = new Dessert("Strudel di mele", 6.38,"è un gustosissimo rotolo di pasta farcito con mele, uvetta, pinoli e cannella.", 5);
        Menu mele= new Menu(dessert4);

        Dessert dessert5 = new Dessert("Gelo di Anguria", 3.99, " Il gelo di mellone (gelu di muluni in siciliano), anche detto gelo d'anguria, è un tipico dolce al cucchiaio siciliano, tradizionalmente preparato a Ferragosto ", 5);
        Menu gelo= new Menu(dessert5);

        addPortataToMenu(crema);
        addPortataToMenu(albicocca);
        addPortataToMenu(cioccolato);
        addPortataToMenu(veli);
        addPortataToMenu(mele);
        addPortataToMenu(gelo);

    }
    public static void aggiuntaBevande() {
        Bevande acqua = new Bevande("Acqua naturale 0.5l", 1.00, "Acqua naturale 0.5l", 4);
        Menu acqua1 = new Menu(acqua);
        Bevande acquaG = new Bevande("Acqua naturale 1l", 2.00, "Acqua naturale 1l in vetro", 4);
        Menu acqua1G = new Menu(acquaG);
        Bevande acquaFrizzante = new Bevande("Acqua frizzante 0.5l", 1.00, "Acqua frizzante 0.5l", 4);
        Menu acquaFrizzante1 = new Menu(acquaFrizzante);
        Bevande acquaFrizzanteG = new Bevande("Acqua frizzante 1l ", 2.00, "Acqua frizzante 1l in vetro", 4);
        Menu acquaFrizzante1G = new Menu(acquaFrizzanteG);
        Bevande cocaColaL = new Bevande("Coca Cola 33cl ", 2.00, "Coca Cola in lattina ", 4);
        Menu cocaColaL1 = new Menu(cocaColaL);
        Bevande cocaColaB = new Bevande("Coca Cola 1.5l ", 4.00, "Coca Cola in bottiglia da 1.5lt", 4);
        Menu cocaColaB1 = new Menu(cocaColaB);
        Bevande sprite = new Bevande("Sprite 33cl", 2.00, "Sprite in lattina", 4);
        Menu sprite1 = new Menu(sprite);
        Bevande fanta = new Bevande("Fanta 33cl", 2.00, "Fanta in lattina", 4);
        Menu fanta1 = new Menu(fanta);
        Bevande birraBionda = new Bevande("Birra bionda 0.25 cl", 4.00, "Castello Lager Premium", 4);
        Menu birraBionda1 = new Menu(birraBionda);
        Bevande birraBiondaG = new Bevande("Birra bionda 0.50 cl", 5.00, "Menabrea Bionda Premium Lager", 4);
        Menu birraBiondaG1 = new Menu(birraBiondaG);
        Bevande birraRossa = new Bevande("Birra rossa 0.25cl", 4.00, "Leffe Rouge", 4);
        Menu birraRossa1 = new Menu(birraRossa);
        Bevande birraRossaG = new Bevande("Birra rossa 0.5cl", 5.00, "Peroni Birra Gran Riserva Rossa", 4);
        Menu birraRossaG1 = new Menu(birraRossaG);

        addPortataToMenu(acqua1);
        addPortataToMenu(acqua1G);
        addPortataToMenu(acquaFrizzante1);
        addPortataToMenu(acquaFrizzante1G);
        addPortataToMenu(cocaColaL1);
        addPortataToMenu(cocaColaB1);
        addPortataToMenu(sprite1);
        addPortataToMenu(fanta1);
        addPortataToMenu(birraBionda1);
        addPortataToMenu(birraBiondaG1);
        addPortataToMenu(birraRossa1);
        addPortataToMenu(birraRossaG1);





    }
}
