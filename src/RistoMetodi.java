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
}
