package enumPackage;

public enum UtilityColorEnum {

    //TODO inserire la descizione

    // Background
    ANSI_BLACK_BACKGROUND("\u001B[40m"),
    ANSI_RED_BACKGROUND("\u001B[41m"),
    ANSI_GREEN_BACKGROUND("\u001B[42m"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m"),
    ANSI_BLUE_BACKGROUND("\u001B[44m"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m"),
    ANSI_CYAN_BACKGROUND("\u001B[46m"),
    ANSI_WHITE_BACKGROUND("\u001B[47m"),

    // Font
    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m"),

    // Style
    ANSI_BOLD("\033[0;1m");

    private String codice;

    UtilityColorEnum(String codice) {
        this.codice = codice;
    }

    public java.lang.String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    //System.out.println(ANSI_GREEN_BACKGROUND.getCodice() + "This text has a green background but default text!" + ANSI_RESET.getCodice());
//System.out.println(ANSI_RED.getCodice() + "This text has red text but a default background!" + ANSI_RESET.getCodice());
//System.out.println(ANSI_GREEN_BACKGROUND.getCodice() + ANSI_RED.getCodice() + "This text has a green background and red text!" + ANSI_RESET.getCodice());
}
