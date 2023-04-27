package enumPackage;

public enum CotturaEnum {
    SANGUE("Al sangue"),
    MEDIA("Cottura media"),
    COTTA("Ben cotta");
    private final String tipoCottura;
    CotturaEnum(String tipoCottura) {
        this.tipoCottura = tipoCottura;
    }
    public String getTipoCottura() {
        return tipoCottura;
    }
}

