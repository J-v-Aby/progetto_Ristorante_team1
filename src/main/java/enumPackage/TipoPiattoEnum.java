package enumPackage;

public enum TipoPiattoEnum {

    /**
     * l'enum TipoPiatto serve per aggiungere un commento riguardo al tipo di piatto, se è biologico, km zero ecc.
     * <p>
     * Questi codici rappresentano le emoji.
     */

    PIATTO_TIPICO("Piatto tipico \uD83D\uDFE2⚪\uD83D\uDD34"),
    CONSIGLIATO_CHEF("Piatto consigliato dallo Chef! \uD83E\uDDD1\u200D\uD83C\uDF73"),
    BIOLOGICO("Piatto 100% Biologico \uD83C\uDF45"),
    KM_ZERO("Ingredienti a chilometro zero \uD83E\uDDD1\u200D\uD83C\uDF3E"),
    MENU_STANDARD("Un classico del nostro Menù! \uD83D\uDC4C");

    private String descrizioneTipoPiatto;

    TipoPiattoEnum(String descrizioneTipoPiatto) {
        this.descrizioneTipoPiatto = descrizioneTipoPiatto;
    }

    public String getDescrizioneTipoPiatto() {
        return descrizioneTipoPiatto;
    }

    public void setDescrizioneTipoPiatto(String descrizioneTipoPiatto) {
        this.descrizioneTipoPiatto = descrizioneTipoPiatto;
    }
}