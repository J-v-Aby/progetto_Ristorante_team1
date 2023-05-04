import enumPackage.*;
import portate.*;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        // HEADER
        System.out.println("\n\n\t\t\t" + UtilityColorEnum.ANSI_YELLOW_BACKGROUND.getCodice() + UtilityColorEnum.ANSI_BLACK.getCodice() +
                "  C O P P A  C I C U T I  " + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
        System.out.println("\t\t\t" + "L'esperienza che ferma il tempo\n" +
                "Le lancette rallentano il loro avanzare, nell’aria il racconto di piatti che emozionano al primo sguardo."
                + "\n" + " Danzatori silenziosi si muovono intorno a te per regalarti lo spettacolo di un servizio impeccabile,"
                + "\n" + " in una cornice di dettagli moreschi che parlano di storie antiche: signore e signori, " +
                "benvenuti nel Ristorante di Coppa Cicuti.");
        System.out.println("\n\t" + "Prezzo Medio: 50€\t" + "Recensioni: ⭐⭐⭐⭐⭐");

        Menu menuCarne = new Menu("Carne", TipologiaEnum.CARNE, 50.00, ChefStellatiEnum.MARCUS_SAMUELSSON);

        /**
         * Qui impostiamo la data odierna tramite la classe Calendar per poi impostare i giorni di natale e stampare il
         * relativo messaggio.
         */
        Calendar dataOdierna = Calendar.getInstance();
        int giornoOggi = dataOdierna.get(Calendar.DAY_OF_MONTH);
        int meseOggi = dataOdierna.get(Calendar.MONTH) + 1;
        menuCarne.setDate(dataOdierna);
        if(giornoOggi == 05 && meseOggi == 05) { //if(giornoOggi == 25 && meseOggi == 12)
            System.out.println("\nBuon Natale da Coppa Cicuti! Per l'occasione il giro di ammazzacaffè lo paga Michele.");
        }

        //carne
        Portata anti1 = new Antipasti("Carpaccio di manzo", 10.50,
                "Fettina di manzo crudo condita con succo di limone, servita con rucola e scaglie di parmigiano.",
                "Slice of raw beef seasoned with lemon juice, served with rocket and parmesan flakes.",
                TipoPiattoEnum.KM_ZERO);
        Portata anti2 = new Antipasti("Polpettine di carne al sugo", 12.00,
                "Polpettine di carne mista (manzo e maiale) in un sugo di pomodoro.",
                "Mixed meatballs (beef and pork) in a tomato sauce.",
                TipoPiattoEnum.PIATTO_TIPICO);
        Portata anti3 = new Antipasti("Involtini di carne con verdure", 15.00,
                "Fettine di carne ripiene di verdure (carote, zucchine, peperoni) cotte in padella.",
                "Slices of meat stuffed with vegetables (carrots, courgettes, peppers) cooked in a pan.",
                TipoPiattoEnum.MENU_STANDARD);
        //pesce
        Portata anti4 = new Antipasti("Tartare di tonno", 18.50,
                "Tartare di tonno crudo condita con olio evo, succo di lime, sale e pepe, servita con avocado a cubetti.",
                "Raw tuna tartare seasoned with extra virgin olive oil, lime juice, salt and pepper, served with diced avocado.",
                TipoPiattoEnum.KM_ZERO);
        Portata anti5 = new Antipasti("Crostini con salmone affumicato e formaggio", 20.50,
                "Crostini di pane tostato con salmone, formaggio fresco cremoso, erba cipollina e pepe.",
                "Toasted croutons with salmon, fresh cream cheese, chives and pepper.",
                TipoPiattoEnum.MENU_STANDARD);
        Portata anti6 = new Antipasti("Gamberetti in salsa rosa", 22.00,
                "Gamberetti lessi serviti con salsa rosa (salsa a base di maionese, ketchup, brandy).",
                "Boiled prawns served with pink sauce (mayonnaise-based sauce, ketchup, brandy).",
                TipoPiattoEnum.PIATTO_TIPICO);
        //vegan
        Portata anti7 = new Antipasti("Crostini con hummus e verdure grigliate",
                8.50, "Crostini di pane tostato spalmati con hummus di ceci e verdure di stagione grigliate.",
                "Toasted croutons spread with chickpea hummus and grilled seasonal vegetables.",
                TipoPiattoEnum.CONSIGLIATO_CHEF);
        Portata anti8 = new Antipasti(
                "Frittelle di zucchine e patate e salsa yogurt",
                10.00,
                "Frittelle di zucchine e patate, servite con salsa allo yogurt vegetale (yogurt vegetale a base di soia o mandorle).",
                "Courgette and potato fritters, served with vegetable yoghurt sauce (soy or almond-based vegetable yoghurt).",
                TipoPiattoEnum.MENU_STANDARD);
        Portata anti9 = new Antipasti("Involtini di melanzane con cous cous e verdure", 12.00,
                "Fettine di melanzane grigliate ripiene di cous cous con verdure di stagione cotte in padella.",
                "Slices of grilled aubergines filled with cous cous with seasonal vegetables cooked in a pan.",
                TipoPiattoEnum.BIOLOGICO);

        menuCarne.addPortata(anti1);
        menuCarne.addPortata(anti2);
        menuCarne.addPortata(anti3);

//        menuPesce.addPortata(anti4);
//        menuPesce.addPortata(anti5);
//        menuPesce.addPortata(anti6);
//
//        menuVegan.addPortata(anti7);
//        menuVegan.addPortata(anti8);
//        menuVegan.addPortata(anti9);


        //PRIMI
        //System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "P R I M I" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
        //Carne
        Portata primiPiatti1 = new PrimiPiatti("Cannelloni alla genovese e sedano ", 13.0,
                "cannelloni  ripieni di carne e sedano croccante gratinati al forno ",
                true, 60);
        Portata primiPiatti2 = new PrimiPiatti("Ravioli di coniglio ", 16.5,
                "ravioli  ripieni di coniglio e aromi conditi con burro e salvia",
                true, 12);
        Portata primiPiatti3 = new PrimiPiatti("Risotto d’autunno ", 15.0,
                "risotto con castagne mele e capocollo profumato con rosmarino ",
                true, 20);
        //Pesce
        Portata primiPiatti4 = new PrimiPiatti("Risotto all’onda con velo di gamberi crudi", 13.5,
                "risotto cremoso con gamberi crudi e zafferano ",
                false, 20);
        Portata primiPiatti5 = new PrimiPiatti("Paccheri, anelli di calamari, pomodoro e salicornia", 15.0,
                "paccheri con calamari pomodoro e salicornia conditi con olio extravergine d’oliva ",
                true, 15);
        Portata primiPiatti6 = new PrimiPiatti("Linguine con capesante, tartufo bianco e basilico", 14.0,
                "linguine con capesante tartufo bianco e basilico conditi con olio extravergine d’oliva ",
                false, 15);
        //Vegan
        Portata primiPiatti7 = new PrimiPiatti("Ravioli vegani di barbabietole con mele e noci", 12.5,
                "ravioli vegani ripieni di barbabietole mele e noci conditi con burro e salvia ",
                true, 15);
        Portata primiPiatti8 = new PrimiPiatti("Spaghetti al pesto di avocado, basilico e pinoli", 13.0,
                "spaghetti al pesto di avocado basilico e pinoli conditi con olio extravergine d’oliva ",
                true, 15);
        Portata primiPiatti9 = new PrimiPiatti("Conchiglioni con broccoli e mandorle", 14.5,
                "conchiglioni ripieni di broccoli e mandorle gratinati al forno ",
                true, 25);


        menuCarne.addPortata(primiPiatti1);
        primiPiatti1.getListaAllergeni().add(AllergeniEnum.SEDANO);
        menuCarne.addPortata(primiPiatti2);
        primiPiatti2.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(primiPiatti3);
//        menuPesce.addPortata(primiPiatti4);
//        primiPiatti4.getListaAllergeni().add(AllergeniEnum.CROSTACEI);
//        menuPesce.addPortata(primiPiatti5);
//        primiPiatti5.getListaAllergeni().add(AllergeniEnum.NICKEL);
//        menuPesce.addPortata(primiPiatti6);
//        primiPiatti6.getListaAllergeni().add(AllergeniEnum.MOLLUSCHI);
//        menuVegan.addPortata(primiPiatti7);
//        primiPiatti7.getListaAllergeni().add(AllergeniEnum.FRUTTA_A_GUSCIO);
//        menuVegan.addPortata(primiPiatti8);
//        primiPiatti8.getListaAllergeni().add(AllergeniEnum.GLUTINE);
//        menuVegan.addPortata(primiPiatti9);
//        primiPiatti9.getListaAllergeni().add(AllergeniEnum.FRUTTA_A_GUSCIO);


        // SECONDI
        //System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "S E C O N D I" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
        // Carne
        Portata arrosto = new SecondiPiatti("Arrosto di Maiale al latte", 13.0,
                "morbido arrosto di maiale avvolto in una vellutata di latte e aromi",
                "Patate al forno", CotturaEnum.COTTA);
        Portata manzo = new SecondiPiatti("Manzo alla Stroganoff", 14.0,
                "straccetti di manzo cotti in una salsa di panna acida, senape e funghi",
                "Verdure", CotturaEnum.MEDIA);
        Portata pollo = new SecondiPiatti("Pollo al curry", 9.0,
                "bocconcini di pollo in una salsa esotica di yogurt, curry e pomodoro",
                "Insalata", CotturaEnum.COTTA);
        // Pesce
        Portata salmone = new SecondiPiatti("Salmone al limone", 14.0,
                "filetti di salmone al forno profumati al limone",
                "Patate al forno", CotturaEnum.SANGUE);
        Portata gamberi = new SecondiPiatti("Spiedini di gamberi e calamari",
                13.0, "spiedini di gamberi e calamari grigliati e conditi con prezzemolo",
                "Insalata", CotturaEnum.COTTA);
        Portata orata = new SecondiPiatti("Sandwich di orata alla siciliana", 12.0,
                "panini senza glutine farciti con filetti di orata cotti al forno e una crema di pomodorini secchi, capperi e olive",
                "Patatine fritte", CotturaEnum.MEDIA);
        // Vegan
        Portata polpette = new SecondiPiatti("Polpette di lenticchie", 8.0,
                "polpette di lenticchie al forno o in padella con pane, aglio e prezzemolo",
                "Verdure", CotturaEnum.COTTA);
        Portata tofu = new SecondiPiatti("Tofu piccante", 9.0,
                "fette di tofu alla piastra con limone e peperoncino",
                "Verdure croccanti alla piastra", CotturaEnum.MEDIA);
        Portata seitan = new SecondiPiatti("Seitan al vino Rosso", 10.0,
                "seitan stufato con vino rosso, cipolla, rosmarino e senape",
                "Funghi porcini", CotturaEnum.MEDIA);

        menuCarne.addPortata(arrosto);
        arrosto.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(manzo);
        manzo.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(pollo);
        pollo.getListaAllergeni().add(AllergeniEnum.ARACHIDI);
//        menuPesce.addPortata(salmone);
//        salmone.getListaAllergeni().add(AllergeniEnum.PESCE);
//        menuPesce.addPortata(gamberi);
//        gamberi.getListaAllergeni().add(AllergeniEnum.PESCE);
//        menuPesce.addPortata(orata);
//        orata.getListaAllergeni().add(AllergeniEnum.PESCE);
//        orata.getListaAllergeni().add(AllergeniEnum.GLUTINE);
//        menuVegan.addPortata(polpette);
//        menuVegan.addPortata(tofu);
//        menuVegan.addPortata(seitan);
//        seitan.getListaAllergeni().add(AllergeniEnum.SENAPE);

        //System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "D E S S E R T" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
        Portata dessert1 = new Dessert("Creme Brulee", 2.30,
                "Crema inglese cotta e sormontata da una sfoglia croccante di zucchero caramellato",
                TipoDessertEnum.CREMA, ChefStellatiEnum.MARIO_PARMEGGIANI,
                "panna fresca liquida, latte, tuorli, zucchero, baccello di vaniglia");
        Portata dessert2 = new Dessert("Cheesecake alle albicocche", 5.90,
                "Base di pasta biscotto su cui poggia un alto strato di crema di formaggio fresco con topping alle albicocche.",
                TipoDessertEnum.FRUTTA, ChefStellatiEnum.MARIO_PARMEGGIANI,
                "biscotti g.free, burro, philadelphia, panna fresca, zucchero gelatina alimentare," +
                        " bacche di vaniglia, confettura di albicocca");
        Portata dessert3 = new Dessert("Cheesecake al cioccolato", 5.90,
                "Base di biscotto su cui poggia un alto strato di crema di formaggio fresco con topping al cioccolato.",
                TipoDessertEnum.CIOCCOLATO, ChefStellatiEnum.MARCUS_SAMUELSSON,
                "biscotti, burro, philadelphia, panna fresca, zucchero gelatina alimentare," +
                        " bacche di vaniglia, crema di cioccolato, scaglie di cioccolato fondente");
        Portata dessert4 = new Dessert("Torta setteveli", 7.40,
                "Pan di Spagna, mandorle pugliesi, mousse di nocciole del Piemonte, " +
                        "cioccolato Madagascar e un fondo di gianduia croccante ai cereali",
                TipoDessertEnum.CIOCCOLATO, ChefStellatiEnum.MARCUS_SAMUELSSON,
                "uova, zucchero, farina, cacao, crema nocciola,cereali al cioccolato,amido di riso, latte," +
                        " gelatia, panna, pasta di nocciole,cioccolato fondente, schiroppo di glucosio");
        Portata dessert5 = new Dessert("Strudel di mele", 6.38,
                "Un gustosissimo rotolo di pasta farcito con mele, uvetta, pinoli e cannella.",
                TipoDessertEnum.FRUTTA, ChefStellatiEnum.VICKY_LAU,
                "mele, uvetta, marsala o vermouth, confettura di albicocca, mandorle," +
                        " panna vegetale, zucchero, cannella");
        Portata dessert6 = new Dessert("Gelo di Anguria", 3.99,
                "Il gelo di anguria (gelu di muluni in siciliano), anche detto gelo d'anguria, " +
                        "è un tipico dolce al cucchiaio siciliano, tradizionalmente preparato a Ferragosto",
                TipoDessertEnum.FRUTTA, ChefStellatiEnum.VICKY_LAU,
                "succo di anguria amido di frumento, zucchero di canna, anice, gocce di cioccolato fondente");

        menuCarne.addPortata(dessert1);
        dessert1.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(dessert2);
        dessert2.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(dessert3);
        dessert3.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(dessert4);
        dessert4.getListaAllergeni().add(AllergeniEnum.UOVA);
        dessert4.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(dessert5);
        dessert5.getListaAllergeni().add(AllergeniEnum.LATTE);
        menuCarne.addPortata(dessert6);

        //System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "B E V A N D E" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
        Portata acqua = new Bevande("Acqua naturale 0.5l", 1.00, "Acqua di Nepi", 0);
        Portata acquaG = new Bevande("Acqua naturale 1l", 2.00, "Boario", 0);
        Portata acquaFrizzante = new Bevande("Acqua frizzante 0.5l", 1.00, "Guizza", 0);
        Portata acquaFrizzanteG = new Bevande("Acqua frizzante 1l ", 2.00, "Natia", 0);
        Portata cocaColaL = new Bevande("Coca Cola", 2.00, "Lattina da 33cl", 0);
        Portata cocaColaB = new Bevande("Coca Cola bottiglia", 4.00, "Bottiglia da 1.5l", 0);
        Portata sprite = new Bevande("Sprite", 2.00, "Lattina da 33cl", 0);
        Portata fanta = new Bevande("Fanta", 2.00, "Lattina da 33cl", 0);
        Portata birraBionda = new Bevande("Birra bionda 0.25 cl", 4.00, "Helles", 4.5);
        Portata birraBiondaG = new Bevande("Birra bionda 0.50 cl", 5.00, "Golden Ale", 5);
        Portata birraRossa = new Bevande("Birra rossa 0.25cl", 4.00, "Peroni Gran Riserva", 6);
        Portata birraRossaG = new Bevande("Birra rossa 0.5cl", 5.00, "McFarland", 6);

        menuCarne.addPortata(acqua);
        menuCarne.addPortata(acquaG);
        menuCarne.addPortata(acquaFrizzante);
        menuCarne.addPortata(acquaFrizzanteG);
        menuCarne.addPortata(cocaColaL);
        menuCarne.addPortata(cocaColaB);
        menuCarne.addPortata(sprite);
        menuCarne.addPortata(fanta);
        menuCarne.addPortata(birraBionda);
        menuCarne.addPortata(birraBiondaG);
        menuCarne.addPortata(birraRossa);
        menuCarne.addPortata(birraRossaG);

        menuCarne.printMenu();



    }
}