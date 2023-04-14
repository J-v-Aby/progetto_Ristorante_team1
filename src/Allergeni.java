public enum Allergeni {
    UOVA("Uova"),
    CROSTACEI("Crostacei"),
    SEDANO("Sedano"),
    GLUTINE("Glutine"),
    ARACHIDI("Arachidi"),
    MOLLUSCHI("Molluschi"),
    FRUTTA_A_GUSCIO("Frutta a guscio"),
    PESCE ("Pesce"),
    LATTE("Latte"),
    SENAPE("Senape"),
    NICKEL("Nickel");

    //TODO sempre i modificatori di accesso
private final String nomeAllergene;
    Allergeni(String nomeAllergene) {
        this.nomeAllergene = nomeAllergene;

    }
}
