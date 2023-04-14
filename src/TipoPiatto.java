public enum TipoPiatto {
    //Questi codici sono le emoji
    PIATTO_TIPICO("\nPiatto tipico \uD83D\uDFE2⚪\uD83D\uDD34"),
    CONSIGLIATO_CHEF("\nPiatto consigliato dallo Chef! \uD83E\uDDD1\u200D\uD83C\uDF73"),
    BIOLOGICO("\nPiatto 100% Biologico \uD83C\uDF45"),
    KM_ZERO("\nIngredienti a chilometro zero \uD83E\uDDD1\u200D\uD83C\uDF3E"),
    MENU_STANDARD("");

    String descrizioneTipoPiatto;

    TipoPiatto(String descrizioneTipoPiatto) {
        this.descrizioneTipoPiatto = descrizioneTipoPiatto;
    }
}