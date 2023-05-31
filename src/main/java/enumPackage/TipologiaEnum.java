package enumPackage;

public enum TipologiaEnum {
    CARNE("Menu Carne"),
    PESCE("Menu Pesce"),
    VEGAN("Menu Vegan");
    private String stringEnum;

    TipologiaEnum(String stringEnum) {
        this.stringEnum = stringEnum;
    }
}

