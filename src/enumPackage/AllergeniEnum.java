package enumPackage;
/**
 * Enum che permette di inserire il tipo di allergene
 * presente nella portata.
 */
public enum AllergeniEnum {

    UOVA("Uova"),
    CROSTACEI("Crostacei"),
    SEDANO("Sedano"),
    GLUTINE("Glutine"),
    ARACHIDI("Arachidi"),
    MOLLUSCHI("Molluschi"),
    FRUTTA_A_GUSCIO("Frutta a guscio"),
    PESCE("Pesce"),
    LATTE("Latte"),
    SENAPE("Senape"),
    NICKEL("Nickel");

    private final String nomeAllergene;

    AllergeniEnum(String nomeAllergene) {
        this.nomeAllergene = nomeAllergene;

    }

    public String getNomeAllergene() {
        return nomeAllergene;
    }
}
