package enumPackage;

public enum TavoliEnum {
    TAVOLO_4(4),
    TAVOLI_6(6),
    TAVOLI_8(8);
    private Integer tipoTavolo;

    TavoliEnum(Integer tavolo){
        this.tipoTavolo =tavolo;

    }

    public Integer getTipoTavolo() {
        return tipoTavolo;
    }
}
