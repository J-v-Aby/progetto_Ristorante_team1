package enumPackage;

public enum StagioniEnum {
    INVERNO(UtilityColorEnum.ANSI_CYAN.getCodice()),
    ESTATE(UtilityColorEnum.ANSI_RED.getCodice()),
    AUTUNNO(UtilityColorEnum.ANSI_YELLOW.getCodice()),
    PRIMAVERA(UtilityColorEnum.ANSI_GREEN.getCodice());
    private String colore;
    StagioniEnum(String colore) {
        this.colore = colore;
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
}

