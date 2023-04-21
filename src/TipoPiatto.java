public enum TipoPiatto {
    //Questi codici sono le emoji
    PIATTO_TIPICO("Piatto tipico \uD83D\uDFE2⚪\uD83D\uDD34"),
    CONSIGLIATO_CHEF("Piatto consigliato dallo Chef! \uD83E\uDDD1\u200D\uD83C\uDF73"),
    BIOLOGICO("Piatto 100% Biologico \uD83C\uDF45"),
    KM_ZERO("Ingredienti a chilometro zero \uD83E\uDDD1\u200D\uD83C\uDF3E"),
    MENU_STANDARD("Un classico del nostro Menù! \uD83D\uDC4C");

    //TODO
    String descrizioneTipoPiatto;

    TipoPiatto(String descrizioneTipoPiatto) {
        this.descrizioneTipoPiatto = descrizioneTipoPiatto;
    }
}